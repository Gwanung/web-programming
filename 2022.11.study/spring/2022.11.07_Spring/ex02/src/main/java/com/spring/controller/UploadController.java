package com.spring.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.spring.domain.AttachFileDTO;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnailator;

@Controller
@Log4j
public class UploadController {

	@GetMapping("/uploadForm")
	public void uploadForm() {
		log.info("upload form");
	}

	// 업로드 파일 저장
	@PostMapping("/uploadFormAction")
	public void uploadFormPost(MultipartFile[] uploadFile, Model model) {

		String uploadFolder = "/Users/wongwan-ung/Documents/Dev/savefile";

		for (MultipartFile multipartFile : uploadFile) {
			log.info("------------------------------");
			log.info("Upload File Name : " + multipartFile.getOriginalFilename()); // 업로드 된 파일 이름
			log.info("Upload File Size : " + multipartFile.getSize()); // 업로드 된 파일 크기

			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());

			try {
				multipartFile.transferTo(saveFile); // 파일 저장
			} catch (Exception e) {
				log.error(e.getMessage());
			} // end catch

		} // end for

	}// end uploadFormPost()

	@GetMapping("/uploadAjax")
	public void uploadAjax() {
		log.info("upload ajax");
	}

	@PostMapping("/uploadAjaxAction")
	@ResponseBody
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		log.info("update ajax post.........");
		

		String uploadFolder = "/Users/wongwan-ung/Documents/Dev/savefileAjax";
		String uploadFolderPath = getFolder();
		
		List<AttachFileDTO> list = new ArrayList<AttachFileDTO>();

		File uploadPath = new File(uploadFolder, uploadFolderPath);
		if (uploadPath.exists() == false)
			uploadPath.mkdirs(); // 년도 별 폴더 생성
		for (MultipartFile multipartFile : uploadFile) {
			AttachFileDTO attachDTO = new AttachFileDTO();
			UUID uuid = UUID.randomUUID();
			String fileName = multipartFile.getOriginalFilename();
			String uploadFileName = uuid.toString() + "_" + fileName;
			attachDTO.setFileName(fileName);
			attachDTO.setUuid(uuid.toString());
			attachDTO.setUploadPath(uploadFolderPath);
			
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1);
			File saveFile = new File(uploadPath, uploadFileName);

			try {
				multipartFile.transferTo(saveFile); // 파일 저장
				if (checkImageType(saveFile)) {
					attachDTO.setImage(true);
					FileOutputStream thumbnail = new FileOutputStream(new File(uploadPath, "s_" + uploadFileName)); 
					Thumbnailator.createThumbnail(multipartFile.getInputStream(), thumbnail, 100, 100); //썸네일 생성
					thumbnail.close();
				}
				list.add(attachDTO);  //리스트 추가
			} catch (Exception e) {
				log.error(e.getMessage());
			}
			
		}//end for
		return new ResponseEntity<>(list, HttpStatus.OK);

	}// end uploadAjaxPost()

	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}// end getFolder()

	// 이미지 파일인지 일반 파일인지의 판단
	private boolean checkImageType(File file) {

		try {
			String contentType = Files.probeContentType(file.toPath());

			return contentType.startsWith("image"); // image 글자로 시작하면 true
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}// end checkImageType()
}

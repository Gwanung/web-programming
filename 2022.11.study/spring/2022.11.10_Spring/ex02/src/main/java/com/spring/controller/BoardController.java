package com.spring.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardAttachVO;
import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;
import com.spring.domain.PageDTO;
import com.spring.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	@Autowired
	private BoardService service;

	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("list---------------------");
		log.info("cri : " + cri);
		int total = service.getTotal(cri);
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}

	@GetMapping("/register")
	public void register() {

	}

	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		if(board.getAttachList() != null) {
			board.getAttachList().forEach(attach -> log.info(attach));
		}
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";
	}

	// 조회
	@GetMapping({ "/get", "/modify" })
	public void get(Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("get or modify");
		model.addAttribute("board", service.get(bno));

	}

	// 수정
	@PostMapping("/modify")
	public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("modify : " + board);
		if (service.modify(board) == 1)
			rttr.addFlashAttribute("result", "success");

		return "redirect:/board/list" + cri.getListLink();
	}

	// 삭제
	@PostMapping("/remove")
	public String remove(Long bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("remove : " + bno);
		List<BoardAttachVO> attachList = service.getAttachList(bno);
		if (service.remove(bno) == 1)
			deleteFiles(attachList);
			rttr.addFlashAttribute("result", "success");
			
		return "redirect:/board/list" + cri.getListLink();
	}
	
	//첨부파일 Json 형태로 반환
	@GetMapping("/getAttachList")
	@ResponseBody
	public ResponseEntity<List<BoardAttachVO>> getAttachList(Long bno){
		log.info("getAttachList : " + bno);
		
		return new ResponseEntity<List<BoardAttachVO>>(service.getAttachList(bno), HttpStatus.OK);
	}
	
	private void deleteFiles(List<BoardAttachVO> attachList) {
		if(attachList == null || attachList.size() == 0) {
			return;
		}
		log.info("delete attach files...............");
		log.info(attachList);
		attachList.forEach(attach -> {
			try {
				Path file = Paths.get("/Users/wongwan-ung/Documents/Dev/savefileAjax" + attach.getUploadPath()
						+ "/" + attach.getUuid() + "_" + attach.getFileName()); 
			Files.deleteIfExists(file);
			if(Files.probeContentType(file).startsWith("image")) {
				Path thumNail = Paths.get("/Users/wongwan-ung/Documents/Dev/savefileAjax" + attach.getUploadPath()
						+ "/s_" + attach.getUuid() + "_" + attach.getFileName());
				Files.delete(thumNail);
			}
			} catch (Exception e) {
				log.error("delete file error " + e.getMessage());
			}
		});//end foreach
	}//end deleteFiles()

}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile2 {

	public static void main(String[] args)  {
		Scanner scan  = new Scanner(System.in);
		System.out.print("원본 파일을 입력하세요 ");
		String inputFileName = scan.next();
		
		System.out.print("복사파일 이름을 입력하시오 ");
		String outputFileName = scan.next();
		
		try (FileInputStream in = new FileInputStream(inputFileName);
				FileOutputStream out = new FileOutputStream(outputFileName)) {
				
				int c;
				while((c = in.read()) != -1) {
					out.write(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println(inputFileName + "을 " + outputFileName + "로 복사하였습니다.");
		}
	}



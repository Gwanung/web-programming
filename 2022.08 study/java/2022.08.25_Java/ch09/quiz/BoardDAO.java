package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardDAO {
	
	private ArrayList<Board> boardList;
	
//	private HashMap<String, String> boardList;
	
	public BoardDAO() {
		boardList = new ArrayList<Board>();
//		boardList = new HashMap<String, String>();
	}
	
	public  void writeArticle(Scanner sc) {
		System.out.println("게시판 글을 작성 하세요 ");
		System.out.print("작성자 : ");
		String register = sc.next();
		System.out.print("비밀번호 : ");
		String passwd = sc.next();
		System.out.print("제목 : ");
		String subject = sc.next();
		System.out.print("글 내용 ");
		String content = sc.next();
		
		Board b = new Board(register, subject, content, passwd);
		boardList.add(b);
		
	}
	
	public void listArticles() {  //목록 보여주는 메소드 
		if(boardList.size() > 0) {
			for(Board b: boardList) {
				System.out.println(b);
			}
		}else {
			System.out.println("등록된 글이 없습니다. ");
		}
	}
	
	public void removeArticle(Scanner sc) { //목록 삭제하는 메소드 
		if(boardList.size() > 0) {
			System.out.println("제거할 글의 작성자와 비밀번호를 입력하세요.");
			System.out.print("작성자 : ");
			String register = sc.next();
			System.out.print("비밀번호 : ");
			String passwd = sc.next();
			
			removeArticle(register, passwd);
		}else {
			System.out.println("등록된 글이 없습니다. ");
		}
	}
	
	private void removeArticle(String register, String passwd) {
		int index = -1;
		for(int i=0; i<boardList.size(); i++) {
			Board b = boardList.get(i);
			if(b.getRegister().equals(register) && b.getPasswd().equals(passwd)) {
				index = i;
				boardList.remove(b); // b== index
				break;
			}
		}// end for
		if(index == -1) {
			System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.  ");
		}
		
	}// removeArticle
	
}// BoardDAO

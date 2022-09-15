package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		BoardDAO boradDAO = new BoardDAO();
		
		do {
			System.out.println("메뉴를 입력하세요 : ");
			System.out.println("1. 게시판 글 쓰기 : ");
			System.out.println("2. 글 목록 보기  : ");
			System.out.println("3. 글 삭제  : ");
			System.out.println("4. 종료 : ");
		
			System.out.print("메뉴번호 입력 : " );
			int menu = sc.nextInt();
			switch(menu) {
				
			case 1:
				    boradDAO.writeArticle(sc);
					break;
			case 2:
					boradDAO.listArticles();
					break;
			case 3:
					boradDAO.removeArticle(sc);
					break;
			case 4:
					stop = true;
					break;
			}	
		}while( !stop);
		
	}
}

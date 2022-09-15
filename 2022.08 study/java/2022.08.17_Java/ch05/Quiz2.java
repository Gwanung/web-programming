import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력하세요> ");
			String a = scan.nextLine();
			if(a.equals("quit")) {
				System.out.println("시스템을 종료합니다.");
				break;		
			}
			if(a.startsWith("www")) 
				System.out.println(a + " 은 'www'로 시작합니다.");
			else
				System.out.println(a + " 은 'www'로 시작하지 않습니다.");
		}	 
	}
}

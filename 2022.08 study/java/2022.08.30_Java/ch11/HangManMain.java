import java.io.IOException;
import java.util.Scanner;

public class HangManMain{

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
				String solution = HangMan.getRandomSolution();
				StringBuffer answer = HangMan.getAnswer(solution);
				while(true) {
							
//							System.out.println("정답 : " + solution);  // 배열 랜덤 값 테스트
							System.out.println("현재상태" + answer);
							System.out.print("글자를 추측하시오: ");
							String c = sc.next();
							//사용자 입력한 단어와 정답이 일치하면 반복을 종료함.
							if(HangMan.check(solution, answer, c.charAt(0)) == true) {
								System.out.println("현재상태" + answer);
								break;
							}
					}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
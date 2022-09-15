import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
//		int count = 0;
//		int answer = 59;
//		while(true) {
//			Scanner scan = new Scanner(System.in);
//			System.out.print("정답을 추측하여 보시오: ");
//			int num = scan.nextInt();
//			if(num >answer) {
//			System.out.println("제시한 정수가 높습니다.");
//			}
//			else if(num < answer){
//				System.out.println("제시한 정수가 낮습니다.");
//			}
//			else {
//				count++;
//				break;
//			}
//			count++;
//		}
//		System.out.println("축하합니다. 시도횟수=" + count);
		Random random = new Random();
		int count = 0;
		int answer = random.nextInt(10);
//		System.out.println(answer);
		int guess;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("정답을 추측하여 보시오:");
			guess =scan.nextInt();
			
			if(guess>answer) {
				System.out.println("높음");
			}
			if(guess< answer) {
				System.out.println("낮음");
			}
			count++;
		} while(answer != guess);
		System.out.println("축하합니다. 시도횟수=" + count);
	}

}

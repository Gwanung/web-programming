package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args){
		
		int answer = (int)(Math.random()*100) +1;
		int input = 0;
		int count = 0;
		
		Scanner scan;
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			try {
				scan = new Scanner(System.in);
				input = scan.nextInt();
			} catch (Exception e) {  // InputMismatchException의 상위 
				System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			}
			
			
		}while(true);
		scan.close();
	}

}

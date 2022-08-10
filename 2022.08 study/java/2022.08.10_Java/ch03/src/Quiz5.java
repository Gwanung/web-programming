import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		int integer;
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		integer = scan.nextInt();
		System.out.println(integer + "의 약수는 다음과 같습니다.");
		for(int i=1; i<integer; i++) {
			if(integer % i == 0) {
				System.out.print(" " + i);		
			}
		}
		
		
	}

}

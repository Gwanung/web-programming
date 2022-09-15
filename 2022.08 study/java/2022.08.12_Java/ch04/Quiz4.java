import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		final int SIZE = 10;
		int a[]= new int[SIZE];
		
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("----------------------------");
		for(int i=0; i<a.length; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println("----------------------------");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("----------------------------");
		System.out.println("원하시는 좌석번호를 입력ㅎ세요(종료는 = -1");
		int s = scan.nextInt();
		if(s == -1) {
			break;
		}
		if(a[s-1] == 0) {
			a[s-1] = 1;
			System.out.println("예약되었습니다.");
		}
		else {
			System.out.println("이미 예약된 자리입니다.");
		}
	  }//while
		
	}

}

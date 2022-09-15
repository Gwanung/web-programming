import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int index = -1;
		Scanner scan = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오: ");
		int number = scan.nextInt();
		
		for(int i=0; i<s.length; i++) {
			if(number == s[i]) {
				index = s[i];
				break;
			}
		}
		if(index >= 0) {
			System.out.print(number + " 값은 " + index + " 위치에 있습니다." );
		}
		else {
			System.out.print("배열 안에 없는 값입니다.");
		}
	}

}

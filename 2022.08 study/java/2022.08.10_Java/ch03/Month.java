import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		int month;
		int date = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 월을 입력하시오:");
		month = scan.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			date = 30;
			break;
		case 2:
			date = 28;
			break;
		default:
			date = 31;
			break;
		}
		System.out.println("월의 날수는 " + date);
	}

}

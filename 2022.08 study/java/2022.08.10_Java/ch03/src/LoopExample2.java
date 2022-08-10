import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력 : ");
		int n = scan.nextInt();
		while(i<=9) {
			System.out.printf("%d*%d = %d\n",n,i, n*i);
			i++;
		}
		for(i=1;i<=9;i++) {
			System.out.printf("%d*%d = %d\n",n,i, n*i);
		}
	}

}

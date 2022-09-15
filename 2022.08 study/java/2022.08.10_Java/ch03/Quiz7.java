import java.util.Random;

public class Quiz7 {

	public static void main(String[] args) {
//		4번 문제
//		int sum = 0;
//		for(int i=1;i<=20;i++) {
//			if((i%2!=0) && (i%3!=0)) {
//				sum += i;
//			}
//		}
//		System.out.print(sum);
//	}
//	5번문제	
//		int sum = 0;
//		int count = 0;
//		int i = 0;
//		while(sum < 100) {
//			count++;
//			i++;
//			if(i%2==0) {
//				sum += i;
//			}
//			else {
//				sum += (-i);
//			}
//		}
//	6번문제
//		for(int a=1;a<=6;a++) {
//			for(int b=1;b<=6;b++){
//				if( (a+b)==6) {
//					System.out.printf("%d+%d=%d",a,b,6);
//					System.out.println();
//				}
//			}
//		}
//		System.out.println(count);
//	7번문제	
//		Random random = new Random();
//		int value = random.nextInt(6);
//		System.out.println(value);
//	8번문제
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((2*x)+(4*y)==10){
					System.out.printf("x=%d,y=%d",x,y);
					System.out.println();
				}
			}
		}
		
	}

}
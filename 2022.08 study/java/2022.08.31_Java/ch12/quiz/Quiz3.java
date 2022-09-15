package quiz;

import java.util.Random;

public class Quiz3 {

	public static void main(String[] args) {
		Random ran = new Random();
		for(int i=0; i<10; i++) {
			System.out.print(ran.nextInt(156)+100 + " ");  //100~255까지
		}
		System.out.println("");
		System.out.print("===================================");
	}

}

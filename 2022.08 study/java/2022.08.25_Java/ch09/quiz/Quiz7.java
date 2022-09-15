package quiz;

import java.util.Random;

public class Quiz7 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int value = r.nextInt(44) + 1;
		
		System.out.println(value);
	}

}

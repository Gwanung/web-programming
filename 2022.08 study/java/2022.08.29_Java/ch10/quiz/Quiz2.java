package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			
			System.out.print("심사위원의 점수 : " );
		 	double value = sc.nextDouble();
		 	list.add(value);
			}
		
			double max = Collections.max(list);
			double min = Collections.min(list);
			double sum = 0.0;
			for(double value : list) {
				sum += value;
			}
			sum -= (max + min);
			System.out.println("정수의 합 : " + sum);
	}

}

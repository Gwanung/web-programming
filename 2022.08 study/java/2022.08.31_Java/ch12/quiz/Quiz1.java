package quiz;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		//년도와 월을 입력 받아 다음과 같이 달력을 출력하는 프로그램을 만들어 보자. 
		//년도를 입력: 
		//월을 입력: 
		// 달력 밑에 출력
		//날짜 띄우기 \t, Calendar.set() 사용 -> 2021 5 1
		//1일이 무슨요일인지 확인(int dayOfWeek = ca.get(Calender.DAY_OF_WEEK))
		// \t 이용하여 요일 이동후 반복문을 사용하여 마지막날 (ca.getActualMaximum(Calendar.DATE)까지 출력
		// 요일은 증가가 되다가 7보다 커지면 줄바꾸기를 한다. (1~ 7까지 )
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력: ");
		int year = sc.nextInt();
		System.out.print("월을 입력: ");
		int month = sc.nextInt();
		Calendar ca = Calendar.getInstance();
		ca.set(year, (month-1), 1);  // 2021 5 1
		int dayOfWeek = ca.get(Calendar.DAY_OF_WEEK);
		int lastDay= ca.getActualMaximum(Calendar.DATE);
		
		System.out.println();
		System.out.println("\t\t" + year  + "년 " + month + "월");
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		
		for(int i=1;i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {  //1~31
			System.out.print(i + "\t");
			if(dayOfWeek % 7 == 0) {  //7이상이면 줄바꿈
					System.out.println();
			}
			dayOfWeek++;
		}
		
		
		
	}

}

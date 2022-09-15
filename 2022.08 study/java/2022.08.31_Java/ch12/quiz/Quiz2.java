package quiz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일입니다.";
				
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		SimpleDateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		
		do {
			System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (예: 2007/05/11)" );
			
			try {
					System.out.print(">>");
					inDate = df.parse(s.next());   //String을 Date 형식으로 변환해줌!!
					break;
			} catch (Exception e) {
				
			}
		}while(true);
		
		System.out.println(df2.format(inDate));
		s.close();
		}

}

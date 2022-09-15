package quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sun.jdi.Value;

public class Quiz3 {

	public static void main(String[] args) {
		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("map", new String("지도"));
		mp.put("school", new String("학교"));


		
		do {
			System.out.print("영어 단어를 입력하시오: ");
			Scanner sc = new Scanner(System.in);
			String key = sc.next();
			
			if(key.equals("quit"))break;
			
			String value = mp.get(key);
			if(value == null)
				System.out.println("단어가 사전에 없습니다.");
			else
				System.out.println("단어의 의미는 : " + value);
			  	
		}while(true);
		
		
	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static String getRandomSolution() throws IOException {  //파일에서 문자 읽어오는 메소드 
		
		BufferedReader in = null;
		ArrayList<String> words = new ArrayList<>();  //arraylist 변경
		
		int count = 0;
		in = new BufferedReader(new FileReader("sample.txt"));
		
		String s;
		while((s = in.readLine()) != null ) {
			words.add(s);
		}
		
		in.close();
		Random r = new Random();
		int idx = r.nextInt(words.size());  // 0~ count -1 까지 
		return words.get(idx);
		
	}// end getRandomSolution() 
	
	public static StringBuffer getAnswer(String solution) {
		StringBuffer answer = new StringBuffer(solution.length());
		for(int i=0; i<solution.length(); i++) {
			answer.append('_');
			
		}
		return answer;  //buffer 반환 (정답의 길이만큼 '_'을 생성함. 
	}// end getAnswer()
	
	public static boolean check(String s, StringBuffer a, char ch) {
		//char -> Character
		int i;
		char input = Character.toUpperCase(ch);
		s = s.toUpperCase();
		
		for(i=0; i<s.length(); i++) { // ex) apple -> 사용자 p 입력 -> _pp__ 로 교체 (한글자씩 대입)
			if(s.charAt(i) == input) {
				a.setCharAt(i, ch);  // 입력받은 문자가 일치하면  '_' 를 문자(ch)로 치환함.  (대소문자 구분없이 가능)
			}
		}
		
//		for(i=0; i<s.length(); i++) { // ex) apple -> 사용자 p 입력 -> _pp__ 로 교체 (한글자씩 대입)
//			if(s.charAt(i) == ch || s.charAt(i) == ch + 32 || s.charAt(i) == ch - 32) {
//				a.setCharAt(i, ch);  // 입력받은 문자가 일치하면  '_' 를 문자(ch)로 치환함.  (대소문자 구분없이 가능)
//			}
//		}
		
		return s.equalsIgnoreCase(a.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
				String solution = getRandomSolution();
				StringBuffer answer = getAnswer(solution);
				while(true) {
							
//							System.out.println("정답 : " + solution);  // 배열 랜덤 값 테스트
							System.out.println("현재상태" + answer);
							System.out.print("글자를 추측하시오: ");
							String c = sc.next();
							//사용자 입력한 단어와 정답이 일치하면 반복을 종료함.
							if(check(solution, answer, c.charAt(0)) == true) {
								System.out.println("현재상태" + answer);
								break;
							}
					}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

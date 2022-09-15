
public class ContinueTest {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'n') {
			n++;
			}
		}
		System.out.println("문장에서 발견된 n의 개수" + n);
		System.out.println(s.length());
	}

}

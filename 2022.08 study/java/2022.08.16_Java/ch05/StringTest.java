
public class StringTest {

	public static void main(String[] args) {
		String proverb = "A Barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이 = " + proverb.length());
		
		s1 = proverb.concat(" never Bites");
		s2 = proverb.replace('B', 'b');
		s3 = proverb.substring(2, 5);
		s4 = proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String str = "20";
		System.out.println(str + str);
		int i = Integer.parseInt(str);
		System.out.println(i + i);
		
		String str2 = "3.14";
		System.out.println(str2 + str2);
		double d = Double.parseDouble(str2);
		System.out.println(d + d );
				
	}

}

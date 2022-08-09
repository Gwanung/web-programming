

public class TypeCasting {

	public static void main(String[] args) {
		double num1 = 30;
		System.out.println(num1);
		System.out.println(59L + 34.5);
		
		int num2 = (int)20.5;   //강제 형변환 하면 정수형이므로 소수점 사라짐. 
		double num3 = 20.5;
		System.out.println(num2);
		
		double num4 = 3.5f + 12;
		System.out.println(num4);
	}

}

public class OuterClass {
	private int value = 10;
	
	class InnerClass{
		public void myMethod() {
			System.out.println("외부 클래스의 값은 : " + value + "입니다.");
		}
	}

	OuterClass(){
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}

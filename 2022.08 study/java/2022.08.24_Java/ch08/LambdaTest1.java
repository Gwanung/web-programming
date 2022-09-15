interface Inter{
	void sayHello();
}

class MyClass2 implements Inter{

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	
	
}

public class LambdaTest1 {

	public static void main(String[] args) {
		Inter mi = new MyClass2();
		mi.sayHello();
		
		Inter mi2 = new Inter() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello anonymons");
			}
		};
		mi2.sayHello();
		
		Inter mi3 = ()-> System.out.println("Hello lamda");
		mi3.sayHello();
		
//		
//		Inter mi4 = (a, b)->{
//				int result = a * b;
//				System.out.println("계산 결과는 : " + result);
//		
//	};
//		mi4.calculate(10, 20);
	}
}

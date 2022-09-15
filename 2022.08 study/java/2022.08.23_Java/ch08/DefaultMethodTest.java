
interface MyInterface{
	public void myMethod1();
	
	default void myMethod2(){
		System.out.println("myMethod2()");
	}
}

public class DefaultMethodTest implements MyInterface{

	@Override
	public void myMethod1() {
		System.out.println("myMethod1()");
	}
	
	public static void main(String[] args) {
		DefaultMethodTest obj = new DefaultMethodTest();
		obj.myMethod1();
		obj.myMethod2();  //디폴트 메소드는 구현하지 않아도 바로 사용이 가능함.
	}


}

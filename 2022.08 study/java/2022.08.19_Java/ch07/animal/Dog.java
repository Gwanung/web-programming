package animal;

public class Dog extends Animal{
	
	public void eat() {
		super.eat();  // 부모 메소드 그대로 쓰고 싶으면 super 사용.
		System.out.println("개가 먹고 있습니다.");
	}
}

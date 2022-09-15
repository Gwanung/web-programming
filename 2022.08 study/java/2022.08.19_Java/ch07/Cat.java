public class Cat extends Animal{

	public static void eat() {
		System.out.println("Cat의 정적 메소드 eat()");
	}
	
	public void sound() {
		System.out.println("Cat의 인스턴스 메소드 sound()");
	}
	
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat; 
		myAnimal.eat(); //static (정적)메소드는 오버라이딩 할 수 없음.
		Cat.eat();
		myAnimal.sound();
	
	}
}

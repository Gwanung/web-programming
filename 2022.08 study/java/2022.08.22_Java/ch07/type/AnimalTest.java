package type;

class Animal{
	void sound(){
		System.out.println("Animal class의 sound()");
	}
}

class Dog extends Animal{
	
	void sound(){
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	void sound(){
		System.out.println("야옹");
	}
}
public class AnimalTest {
	static Animal arr[];
	public static void main(String[] args) {
		init();
		test();
		
	}
	public static void init(){
		arr = new Animal[3];
		arr[0] = new Animal();
		arr[1] = new Dog();
		arr[2] = new Cat();
	}
	public static void test() {
		for(int i=0;i<arr.length;i++)
			arr[i].sound();
	}
}

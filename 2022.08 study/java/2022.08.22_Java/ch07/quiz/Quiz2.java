package quiz;

class Unit{
	int x, y;
	Unit(){
		
	}

	void move(int x, int y) {
		System.out.println("x축으로" + x + "만큼 " + "y축으로" + y + "만큼 이동해라");
	}
	
	void stop() {
		System.out.println("현재 위치에 정지");
	}
}


class Marine extends Unit{
	int x, y;
	
	Marine(){
		super.move(10, 10);
		super.stop();
	}
	
	void stimPack() {
		System.out.println("스팀 팩을 사용한다.");
	}
	
}

class Tank extends Unit{
	int x, y;

	Tank(){
		super.move(20, 20);
		super.stop();
	}
	
	void changeMode() {
		System.out.println("공격모드 변환");
	}

}

class Dropship extends Unit{
	int x, y;
	
	Dropship(){
		super.move(30, 30);
		super.stop();
	}
	
	void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}
public class Quiz2 {
	
	public static void main(String[] args) {
		Marine obj1 = new Marine();
		obj1.stimPack();
		System.out.println();
		Tank obj2 = new Tank();
		obj2.changeMode();
		System.out.println();
		Dropship obj3 = new Dropship();
		obj3.unload();
		
	}

}

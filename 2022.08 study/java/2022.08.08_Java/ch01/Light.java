//long형 정수 변수 사용 예
package ch01;

public class Light {

	public static void main(String[] args) {
//		변수 선언
		long lightspeed = 300000;   
		long distance;
		
		distance = lightspeed * 60 * 60 * 24 * 365L;
		System.out.println("빛이 1년동안 가는 거리: " + distance + "km");
	}

}

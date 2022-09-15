
public class BadIndex {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = 0;
		}
		
		try {
			int result = arr[10];
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 인덱스가 잘못되었습니다.");
			e.printStackTrace(); // 예외 발생 위치 확인 
		}
		System.out.println("이 문장이 실행이 될까?");
	}
	

}

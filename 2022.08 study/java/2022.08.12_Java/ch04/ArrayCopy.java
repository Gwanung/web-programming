import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int list[] = {10, 20, 30, 40, 50};
		int numbers[] = list;
		int list_copy[] = Arrays.copyOf(list, 5);
		System.out.println(list);
		System.out.println(numbers); // list와 number은 같은 주소 값을 공유함
		System.out.println(list_copy); // Arrays 클래스의 copyOf 메소드를 사용한 list_copy는 배열이 새로 만들어져서 다른 주소값을 가짐.
//		numbers[0] = 20;
//		System.out.print(numbers[0]);
//		System.out.print(list[0]);
		
		for(int ele:list) {
			System.out.print(ele + " ");
		}
		System.out.println("\n------------------");
		for(int ele:numbers) {
			System.out.print(ele + " ");
		}
	}

}


public class ArrayTest {

	public static void main(String[] args) {
		int[] intArray;
		char[] charArray;
		
		int arr[];
		char arr2[];
		
		int arr3[] = new int[10];
		char arr4[] = new char[10];
		
		int arr5[] = {1,2,3,4,5}; // 배열의 주소값
		char arr6[] = {'a','b'};
	
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=i;
			System.out.println(arr3[i]); //배열의 실제값
		}
	}

}

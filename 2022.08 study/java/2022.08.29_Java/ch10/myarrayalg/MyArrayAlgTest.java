package myarrayalg;

class MyArrayAlg{
	
	public static <T> T getLast(T a[]){
		
		return a[a.length -1];
	}
	
	public static <T> void swap(T a[], int i, int j){
		T swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		
	}
	
}

public class MyArrayAlgTest {

	public static <T> void printArray(T a[]) {
		int i;
		for(i=0; i<a.length; i++) 
			System.out.print(a[i] + " ");
			System.out.println("");
		
		
	}
	public static void main(String[] args) {
		
		String language[] = {"C++", "C#", "JAVA"};
		
//		String last = MyArrayAlg.getLast(language);
//		System.out.println(last);
		
//		MyArrayAlg.swap(language, 1, 2);   // index 1과 2의 값을 swap 
//		for(String value : language) {
//			System.out.println(value);
//		}
		
		Integer[] iArray = {10, 20, 30, 40, 50};
		Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] cArray = {'K', 'O', 'R', 'E', 'A'};
		
		printArray(iArray);
		printArray(dArray);
		printArray(cArray);
		
		
	}

	

}

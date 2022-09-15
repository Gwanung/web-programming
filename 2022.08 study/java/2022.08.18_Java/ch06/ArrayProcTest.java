
public class ArrayProcTest {
	final static int STUDENTS = 5;
	public static void main(String[] args) {
		
		int score[] = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(score);
		System.out.println("평균은 = " + obj.getAverage(score));
	}

}

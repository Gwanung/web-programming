
public class Student {
	
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		int total = kor + eng + math;
		
		return total;
	}
	
	float getAverage() {
		float average = (float)(kor + eng + math)/ 3; 
		
		return average;
	}
}

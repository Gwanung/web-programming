import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		String sample[] = {"i", "walk", "the", "line"};

		List<String>  list = Arrays.asList(sample); // 배열을 리스트 형태로 변환!
		Collections.sort(list);
		System.out.println(list);		
	}

}

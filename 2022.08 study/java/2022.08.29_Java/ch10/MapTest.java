import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "ㄹㄹㄹㄹ"));
		st.put("20090002", new Student(20090002, "ㄹㄹㄹ"));
		st.put("20090003", new Student(20090003, "ㄹㄹ"));
		st.remove("20090001");
		st.put("20090003", new Student(20090003, "ㄹ"));
		
		System.out.println(st);		
		System.out.println(st.get("20090003"));  // 값 만 가져오기
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + "value = " + value);
			
		}
	}

}

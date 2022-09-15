import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {  //읽어올 요소가 있는지 확인함. 있으면 true 없으면 false.
			
			s = (String)e.next();
			System.out.println(s);
		}
		
//		list.add("Milk");
//		list.add("Bread");
//		list.add("Butter");
//		
//		list.add(1, "Apple");  //밀어냄 (원래있던 index 1번 앞에 생성)
//		list.set(2, "Grape");  // replace역할 (값 변경)
//		list.remove(3); 
//		
//		for(String ele:list) {
//			System.out.println(ele);
//		}
	}

}

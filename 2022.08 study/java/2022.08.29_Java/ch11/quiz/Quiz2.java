package quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Quiz2 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			FileReader fr = new FileReader("String.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				int value = Integer.parseInt(line);
				list.add(value);
			}
			fr.close();
			Collections.sort(list);
			PrintWriter pw = new PrintWriter(new FileWriter("String_out2.txt"));
			for(int value :list) {
				pw.println(value);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		BufferedReader in = new BufferedReader(new FileReader("String.txt"));
//		BufferedWriter out = new BufferedWriter(new FileWriter("String_out.txt"));
//		
//		ArrayList<Integer> list = new ArrayList<Integer>(); 
//		String s;
//		
//		while((s = in.readLine()) != null) {
//			list.add(Integer.parseInt(s));
//			Collections.sort(list);
//				
//		}
//		out.write(list + " ");
//		out.flush();
//		System.out.print("정렬 종료");
	}

}

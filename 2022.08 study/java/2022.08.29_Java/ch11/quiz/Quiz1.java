package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz1 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		BufferedReader in2 = new BufferedReader(new FileReader("input2.txt"));
		
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		
		String c;
		
		while((c =in.readLine()) != null) {
			out.write(c);
		}
		
		while((c =in2.readLine()) != null) {
			out.write(c);
		}
		
		out.flush();
		System.out.println("합치기 종료");
		
	}

}

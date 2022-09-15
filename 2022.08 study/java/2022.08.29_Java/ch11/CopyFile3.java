import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile3 {

	public static void main(String[] args)  throws IOException{
		FileReader in = null;
		FileWriter out = null;
		
		
		try {
				in =  new FileReader("input.txt");
				out = new FileWriter("output2.txt");
	
				int c;
				while((c=in.read()) != -1) {
				out.write(c);
		}
		
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null)
				in.close();
			if(out !=null)
				out.close();
		}
		
		
				 
	}

}

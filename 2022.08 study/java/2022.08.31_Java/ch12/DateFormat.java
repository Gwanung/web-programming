import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat();  
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		
		String result = df.format(today);
		String result2 = df2.format(today);
		System.out.println(result);
		System.out.println(result2);
	}

}

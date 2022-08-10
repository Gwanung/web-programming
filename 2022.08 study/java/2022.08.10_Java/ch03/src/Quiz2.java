import java.time.LocalDateTime;
public class Quiz2 {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		int currentHour = timePoint.getHour();
		String data;
		System.out.println("현재시간은 " + timePoint);
		
		if(currentHour >= 20) {
			data = "Good Night";
		}
		else if(currentHour >=15) {
			data = "Good Evening";
		}
		else if(currentHour >=11) {
			data = "Good Afternoon";
		}
		else {
			data = "Good Morning";
		}
		System.out.println(data);
	}

}

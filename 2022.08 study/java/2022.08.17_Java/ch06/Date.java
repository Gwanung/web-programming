
public class Date {

	private int year, day;
	private String month;
	
	public Date() {
		this(1900, "1월", 1);
	}
	
	public Date(int year) {
		this(year, "1월", 1);
	}
	
	public Date(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", day=" + day + ", month=" + month + "]";
	}
}

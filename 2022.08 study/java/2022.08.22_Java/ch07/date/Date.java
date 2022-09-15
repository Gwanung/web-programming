package date;

public class Date {
	private int year, mouth, day;

	public Date(int year, int mouth, int day) {
		super();
		this.year = year;
		this.mouth = mouth;
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ", mouth=" + mouth + ", day=" + day + "]";
	}
	
	

}

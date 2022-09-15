public class UnitConversion {
	
	
	public static double kiloToMile(double km) {
		double m = (0.621371)* km;
		return m;
	}
	
	public static double mileToKilo(double m) {
		double km = (1.60934)*m;
		return km;
	}
	
	public static double faToCel(double f) {
		double c = (f*9/5) + 32;
		return c;
	}
	
	public static double celToFa(double c) {
		double f = (c*5/9) - 32;
		return f;
	}
}

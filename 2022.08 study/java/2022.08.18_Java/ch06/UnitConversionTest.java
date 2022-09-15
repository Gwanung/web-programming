
public class UnitConversionTest {

	public static void main(String[] args) {
		UnitConversion obj = new UnitConversion();
		
		System.out.println("1km는 " + obj.kiloToMile(3));
		System.out.println("1mile은 " + obj.mileToKilo(3));
		
		UnitConversion obj2 = new UnitConversion();
		
		System.out.println("1도는" + obj2.faToCel(2));
		System.out.println("1도는" + obj2.celToFa(2));
	}

}

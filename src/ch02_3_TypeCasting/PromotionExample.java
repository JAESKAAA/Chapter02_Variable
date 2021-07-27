package ch02_3_TypeCasting;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue = "+intValue);
		

		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue = "+ longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue = "+ floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue = "+ doubleValue);
		
		intValue = (int)floatValue;
		System.out.println("floatValue "+intValue);
		System.out.println("floatValue  0.5 손실");
		
	}
}

package ch02_3_TypeCasting;

public class CastingExample {

	public static void main(String[] args) {

		int intValue = 44032;
		char charValue = (char)intValue;
		
		System.out.println("int -> char 강제 타입 변환= "+charValue);
		
		int iv = 1000000;
		byte bv = (byte) iv;
		System.out.println(bv);
		
		String id = "123454";
		
		int idChecker = Integer.parseInt(id);
		
		long longValue =50000000000L;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue =3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
	}

}

package ch02_3_TypeCasting;

public class StringConcatExample {

	public static void main(String[] args) {

		int value = 10+2+8;
		System.out.println("value : "+value);
		
		String str1 = 10+2+"8";
		System.out.println(str1); // 128
		
		String str2 = 10+ "2" +8; //1028
		System.out.println(str2);
		
		String str3 = "10"+ 2+8; // 1028
		System.out.println(str3);
		
		String str4 = "10"+ (2+8); //1010
		System.out.println(str4);
		
		
		
		
	}

}

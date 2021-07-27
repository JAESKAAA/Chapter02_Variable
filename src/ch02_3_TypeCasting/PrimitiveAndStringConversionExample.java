package ch02_3_TypeCasting;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		int value1 = Integer.parseInt("10");

		String value2 = String.valueOf(value1);

		System.out.println(value2);

		System.out.println(Integer.MAX_VALUE); // Integer 최대 허용 범위
		System.out.println(Integer.MIN_VALUE); // Integer 최소 허용 범위
		System.out.println(Integer.SIZE); // Integer의 비트 사이즈 -> 4바이트니까 32비트
		System.out.println(Long.SIZE); // Integer의 비트 사이즈 -> 4바이트니까 32비트

		double value3 = Double.parseDouble("3.14");
		boolean value4 = Boolean.parseBoolean("true");

		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
		System.out.println("value4 = " + value4);

		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		String str4 = Integer.toString(100);
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("toString = "+str4);
		
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
				if(max <arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println("******배열 계산문*******");
		System.out.println("total = " + sum);
		System.out.println("최대값 =" +max);
	}

}

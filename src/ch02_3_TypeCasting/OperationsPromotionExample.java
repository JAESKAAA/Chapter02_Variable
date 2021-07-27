package ch02_3_TypeCasting;

public class OperationsPromotionExample {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2= 20;
//		byte byteValue3 = byteValue1 + byteValue2; // 컴파일 에러나는 이유는 bytevalue1,2가 실수로 자동 형변환 되었기 때문. int로 바꿔주면 에러 안남
		int intValue1 = byteValue1 + byteValue2; // 컴파일 에러나는 이유는 bytevalue1,2가 실수로 자동 형변환 되었기 때문. int로 바꿔주면 에러 안남
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
//		char charValue3 = charValue1 + charValue2; // 마찬가지 인트로 변환되기 때문
		int intValue2 = charValue1 + charValue2; // 마찬가지 인트로 변환되기 때문
		System.out.println(intValue2);
		
		int intValue3 =10;
		int intValue4 =intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 =10;
//		int intValue6 = 10/4.0; // 실수로 나눴으면 실수타입으로 값이 반환되므로 타입을 double로 바꿔줘야함
		double doubleValue1 = 10/4.0; // 실수로 나눴으면 실수타입으로 값이 반환되므로 타입을 double로 바꿔줘야함
		System.out.println(doubleValue1);

		int x =1;
		int y =2;
							//(X = int -> double) / (y = 그대로 Int타입) = 연산 결과는 실수로 타입 변환됨
		double result = (double) x / y;
		System.out.println(result);
		
		double hh= (double)3/4;
		System.out.println(hh);
	}

}

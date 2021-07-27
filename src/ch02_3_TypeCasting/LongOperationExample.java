package ch02_3_TypeCasting;

public class LongOperationExample {

	public static void main(String[] args) {

			byte v1 = 100;
			int v2 = 1000;
			long v3 = 10000l;
			
			long result = v1+v2+v3; // byte + int + long - > byte가 int로 형변환 되어 int+int 가 먼저 수행됨, 이후 int가 long으로 형변환 되어 long+long 수행되어 변수에는 long타입이 담길수 있는것임
			
		
	}

}

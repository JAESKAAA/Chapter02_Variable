package ch02_3_TypeCasting;

public class ByteOperationExample {

	public static void main(String[] args) {

		byte result1 = 10+20;
		System.out.println(result1);
		
		int result2 = 10+20;

		double x=10.5;
		int y = 20;
		
		double result = x+y;
		System.out.println(result);

	
		int [] total = {32, 46, 50, 60, 70};
		int sum = 0;
		for (int i=0; i<total.length; i++) {
			sum += total[i];
			
		}
		
//		double avg = (double)(sum / total.length); //이렇게 되면 sum 이랑 length 값이 모두 정수 이기 떄문에 정수값만 반환됨. 즉 51만 반환되는데 거기에 실수로 표현한 값밖에 안나옴.
		double avg = (double)sum / total.length; //이렇게 되면 sum 을 실수형태로 형변환 후 계산 하기 때문에 계산 결과가 실수로 나옴
		
		System.out.println(sum);
				System.out.println(avg);
	
	}

}

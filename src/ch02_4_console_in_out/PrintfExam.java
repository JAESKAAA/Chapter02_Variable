package ch02_4_console_in_out;

import java.util.Arrays;

public class PrintfExam {

	public static void main(String[] args) {
//
//		System.out.printf("이름: %6s, 성별: %s%n", "박지성", "남");
//		System.out.printf("이름: %6s, 성별: %s, 나이: %d%n", "박지성", "남", 27);
//		System.out.printf("이름: %6s, 성별: %s, 나이: %d, 키: %1.2f%n", "박지성", "남", 27, 176.7);
//		
//		double area = 3.141592 *10 *10;
//		System.out.printf("반지름이 %d인 원의 넓이:%8.3f%n", 10, area );
//		
//		String name = "홍길동";
//		int age = 50;
//		String job = "도적";
//		
//		System.out.printf("안녕 난 %s쓰%n%d살인디 %s이당%n", name, age,job);
//		
		String[][] arr = {
				{"최정", "김광현", "김성현", "로맥", "한동민"},
				{"30", "33", "29", "25", "23"}
		};
		
		// Arrays에 deepToString메서드 사용시 2차원 배열을 출력 할 수 있음
//		System.out.printf("이름: %s, 나이: %d",Arrays.deepToString(arr));
		//배열로 출력하는거 다시 알아보기
		System.out.println("********SK와이번스 선수 명단**********");
		for (int i=0; i<arr.length; i++) {
			String[] name1 = arr[i];
			for(int j=0; j<name1.length; j++) {
				System.out.println("이름: "+arr[i][j]);
				System.out.println("나이: "+arr[i+1][j]);
			
			}
		}
	}

}

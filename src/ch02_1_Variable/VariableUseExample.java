package ch02_1_Variable;

public class VariableUseExample {
	int v1 =15; // JVM에 변수 v1 선언하고 15라는 값을 메모리에 할당해달라는 표기인데, 이상태로는 메모리에 올라가지 않아서 static을 붙혀줘야함
	public static void main(String[] args) {
		int x = 3, y = 7;
		
		int temp = x;
		
		x=y;
		y=temp;
		System.out.println("x = "+x+" y = "+y);
		
		
		
	}
 //static -> 메모리에 올려준다고 생각해야함. main 메서드도 static이기 때문에 기본적으로 메모리에올라가는 것임
	
	
}


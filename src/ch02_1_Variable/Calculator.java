package ch02_1_Variable;

public class Calculator {

	int value1;
	int value2;
	
	
	Calculator(int value1, int value2){
		this.value1 =value1;
		this.value2 =value2;
	}
	
	
	public int puls() {
		return value1+ value2;
		}
	public int minus() {
		return value1 - value2;
	}
	public double divided() {
		return value1 / value2;
	}
	public int multiply() {
		return value1 * value2;
	}
	
}

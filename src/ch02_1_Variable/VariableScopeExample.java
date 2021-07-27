package ch02_1_Variable;

public class VariableScopeExample {

	public static void main(String[] args) {

		int v1 = 0;
		
		if(true) {
			int v2 = 0;
			v1 = 1;
			v2 = 1;
			
		}
		
		System.out.println(v1);
		
	}

}

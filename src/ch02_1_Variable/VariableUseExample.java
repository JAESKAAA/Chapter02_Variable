package ch02_1_Variable;

public class VariableUseExample {
	int v1 =15; // JVM�� ���� v1 �����ϰ� 15��� ���� �޸𸮿� �Ҵ��ش޶�� ǥ���ε�, �̻��·δ� �޸𸮿� �ö��� �ʾƼ� static�� ���������
	public static void main(String[] args) {
		int x = 3, y = 7;
		
		int temp = x;
		
		x=y;
		y=temp;
		System.out.println("x = "+x+" y = "+y);
		
		
		
	}
 //static -> �޸𸮿� �÷��شٰ� �����ؾ���. main �޼��嵵 static�̱� ������ �⺻������ �޸𸮿��ö󰡴� ����
	
	
}


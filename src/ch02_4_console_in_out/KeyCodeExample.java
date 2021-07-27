package ch02_4_console_in_out;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("Keycode "+keyCode);
			if(keyCode == 113) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}


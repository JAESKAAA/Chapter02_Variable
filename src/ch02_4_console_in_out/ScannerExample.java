package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(true) {
			input = scanner.nextLine();
			System.out.println("입력된 문자열  \""+input+"\"");
			if(input.equals("q")) {
				break;
			}
		}// while
		System.out.println("종료합니다.");

	}
}

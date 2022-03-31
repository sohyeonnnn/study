package ch9;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] argArr = null;

		while (true) {
			String prompt = ">>";
			System.out.print(prompt);

			String input = s.nextLine();

			input = input.trim();
			argArr = input.split(" +");

			String command = argArr[0].trim();

			if ("".equals(command))
				continue;

			// 명령어를 소문자로 바꿈
			command = command.toLowerCase();

			if (command.equals("q")) {
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
		}
	}

}

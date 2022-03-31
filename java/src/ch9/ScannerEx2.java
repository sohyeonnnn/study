package ch9;

import java.io.File;
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;

		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		System.out.println("sum=" + sum);
		System.out.println("average=" + (double) sum / cnt);

		// data2.txt파일로부터 데이터를 읽어서 합과 평균을 계산하는 예제

	}

}

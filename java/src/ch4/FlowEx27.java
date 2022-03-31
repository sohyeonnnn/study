package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print("입력 >>");
			
			String tmp=sc.nextLine();
			num=Integer.parseInt(tmp);
			
			//int num=sc.nextInt();
		
			if(num==0) {
				flag=false;
				System.out.println("종료");
			}else {
				sum+=num;
				System.out.println("합계: "+sum);
			}
		}
	}

}

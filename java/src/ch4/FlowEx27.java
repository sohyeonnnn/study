package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���(�������� 0�� �Է�)");
		
		while(flag) {
			System.out.print("�Է� >>");
			
			String tmp=sc.nextLine();
			num=Integer.parseInt(tmp);
			
			//int num=sc.nextInt();
		
			if(num==0) {
				flag=false;
				System.out.println("����");
			}else {
				sum+=num;
				System.out.println("�հ�: "+sum);
			}
		}
	}

}

package ch4;

public class FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		// �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ����� �� �ִ�
		for(int tmp:arr) {
			System.out.printf("%d ",tmp);
			sum+=tmp;
		}
		
		System.out.println();
		System.out.println("sum="+sum);
	}

}

package ch4;

public class FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		// 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다
		for(int tmp:arr) {
			System.out.printf("%d ",tmp);
			sum+=tmp;
		}
		
		System.out.println();
		System.out.println("sum="+sum);
	}

}

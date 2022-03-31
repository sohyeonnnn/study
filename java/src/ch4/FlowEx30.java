package ch4;

public class FlowEx30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100) { //1부터 몇까지 더했을때 합이 100을 넘지 않는지 확인
				// break문은 자신이 포함된 가장 가까운 반복문을 벗어남
				break; //sum이 100을 넘으면 break
			}
			++i;
			sum += i; 
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}

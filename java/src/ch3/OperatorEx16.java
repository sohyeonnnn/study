package ch3;

public class OperatorEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f; // 소수점 이하는 반올림 없이 버려짐
		System.out.println(shortPi);
	}

}

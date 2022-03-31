package ch3;

public class OperatorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a'; // 97
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;

		c3 = (char) (c1 + 1); // 'a'+1='b'
		c2++; // 98
		c2++; // 99

		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

	}

}

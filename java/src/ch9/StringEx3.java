package ch9;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cArr = new char[0]; // ���̰� 0�� char�迭 ����, char[] cArr={};�� ����
		String s = new String(cArr); // String s=new String("");�� ����

		System.out.println("cArr.lengh=" + cArr.length); // 0
		System.out.println("@@@" + s + "@@@"); // ����
	}

}

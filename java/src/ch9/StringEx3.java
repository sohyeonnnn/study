package ch9;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cArr = new char[0]; // 길이가 0인 char배열 생성, char[] cArr={};와 같음
		String s = new String(cArr); // String s=new String("");와 같음

		System.out.println("cArr.lengh=" + cArr.length); // 0
		System.out.println("@@@" + s + "@@@"); // 공백
	}

}

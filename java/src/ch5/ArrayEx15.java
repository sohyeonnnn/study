package ch5;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		String result = "";

		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A']; // 몇번째 알파벳인지 구해서 배열에 모스부호 추가
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);

	}

}

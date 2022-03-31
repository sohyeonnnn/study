package ch5;

public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Kim", "Park", "Yi" };

		for (int i = 0; i < names.length; i++) {
			System.out.printf("names[%d]:%s%n", i, names[i]);
		}
		String tmp = names[2];
		System.out.println("tmp: " + tmp);
		names[0] = "Yu"; // 배열 첫번째 값 변경

		for (String str : names) {
			System.out.println(str);
		}
	}

}

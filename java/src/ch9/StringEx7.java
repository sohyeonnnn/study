package ch9;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Hello.java";

		// fullName���� '.'�� ��ġ�� ã�´�
		int index = fullName.indexOf('.');

		// fullName�� ù��° ���ں��� '.'�� �ִ� ������ ���ڿ��� ����
		String fileName = fullName.substring(0, index);

		// '.'�� ���� ���ں��� �����ؼ� ���ڿ��� ������ ����
		// fullName.substring(index+1,fullName.length());�� ����� ����
		String ext = fullName.substring(index + 1);

		System.out.println(fullName + "�� Ȯ���ڸ� ������ �̸��� " + fileName);
		System.out.println(fullName + "�� Ȯ���ڴ� " + ext);
	}

}

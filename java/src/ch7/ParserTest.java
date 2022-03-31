package ch7;

interface Parseable { // �������̽�
	// ���� �м��۾� ����
	public abstract void parse(String fileName);// �߻�޼���
}

class ParserManager {
	// ����Ÿ���� parseable�������̽�
	// �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�ؾ���
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser(); //�ѹ������� ����
		}
	}
}

class XMLParser implements Parseable { // parseable�������̽��� �����ϴ� Ŭ����
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ�
		System.out.println(fileName + "-XML parsing completed");
	}
}

class HTMLParser implements Parseable {// parseable�������̽��� �����ϴ� Ŭ����
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ�
		System.out.println(fileName + "-HTML parsing completed");
	}
}

class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable parser = ParserManager.getParser("XML"); // XMLParser �ν��Ͻ� ����
		parser.parse("document.xml"); // XMLParser�� parse�޼��� ȣ��
		parser = ParserManager.getParser("HTML");// HTMLParser �ν��Ͻ� ����
		parser.parse("doucment2.html");

	}

	// ���߿� ���ο� NewXMLParserŬ������ ���͵� ParserTestŬ������ ������ �ʿ����
	// ParserManagerŬ������ getParser�޼��忡�� return new NewXMLParser();�� �����ϸ� �ȴ�

}

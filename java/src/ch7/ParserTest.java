package ch7;

interface Parseable { // 인터페이스
	// 구문 분석작업 수행
	public abstract void parse(String fileName);// 추상메서드
}

class ParserManager {
	// 리턴타입이 parseable인터페이스
	// 해당 인터페이스를 구현한 클래스의 인스턴스를 반환해야함
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser(); //한문장으로 가능
		}
	}
}

class XMLParser implements Parseable { // parseable인터페이스를 구현하는 클래스
	public void parse(String fileName) {
		// 구문 분석작업을 수행하는 코드
		System.out.println(fileName + "-XML parsing completed");
	}
}

class HTMLParser implements Parseable {// parseable인터페이스를 구현하는 클래스
	public void parse(String fileName) {
		// 구문 분석작업을 수행하는 코드
		System.out.println(fileName + "-HTML parsing completed");
	}
}

class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable parser = ParserManager.getParser("XML"); // XMLParser 인스턴스 생성
		parser.parse("document.xml"); // XMLParser의 parse메서드 호출
		parser = ParserManager.getParser("HTML");// HTMLParser 인스턴스 생성
		parser.parse("doucment2.html");

	}

	// 나중에 새로운 NewXMLParser클래스가 나와도 ParserTest클래스는 변경할 필요없이
	// ParserManager클래스의 getParser메서드에서 return new NewXMLParser();로 변경하면 된다

}

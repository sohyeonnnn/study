package ch6;

public class BlockTest {

	// BlockTest가 메모리에 로딩될때, 클래스 초기화 블럭이 가장 먼저 수행되어 static{}이 화면에 출력
	// 그 다음에 main이 수행되어 BlockTest인스턴스가 생성되면서 인스턴스 초기화 블럭이 먼저 수행되고, 생성자가 수행

	// 클래스 초기화 블럭은 처음 메모리에 로딩될때 한번만 수행되었지만
	// 인스턴스 초기화 블럭은 인스턴스가 생성될때마다 수행

	static { // 클래스 초기화 블럭
		System.out.println("static { }");//1
	}

	{ // 인스턴스 초기화 블럭
		System.out.println("{ }");//3
	}

	public BlockTest() {
		System.out.println("생성자");//4 , 6
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt=new BlockTest();");//2
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2=new BlockTest();");//5
		BlockTest bt2 = new BlockTest();
	}

}

package ch6;

class Product {
	static int count = 0;
	int serialNo;

	{ // 인스턴스 초기화 블럭
		++count;
		serialNo = count;
	}

	public Product() { // 기본 생성자
	}
}

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// product클래스의 인스턴스를 생성할 때마다 인스턴스 블럭이 수행되어
		// 1씩 증가되면서 변수에 저장된다
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		// 생성자가 하나 밖에 없기 때문에 인스턴스 블럭 대신, product클래스의 생성자를 사용해도 결과는 같지만,
		// 코드의 의미상 모은 생성자에서 공통으로 수행되어야 하는 내용이기 때문에 인스턴스 블럭 사용
		// 만일 count를 인스턴스 변수로 선언했다면 인스턴스가 생성될 때마다 0으로 초기화 될것이므로
		// 모든 product인스턴스의 serialNo는 항상 1이 될것이다
		System.out.println("p1의 제품번호는 " + p1.serialNo);
		System.out.println("p2의 제품번호는 " + p2.serialNo);
		System.out.println("p3의 제품번호는 " + p3.serialNo);
		System.out.println("생상된 제품의 수는 모두 " + Product.count + "개 입니다");

	}

}

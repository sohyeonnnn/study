package ch6;

class Product {
	static int count = 0;
	int serialNo;

	{ // �ν��Ͻ� �ʱ�ȭ ��
		++count;
		serialNo = count;
	}

	public Product() { // �⺻ ������
	}
}

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// productŬ������ �ν��Ͻ��� ������ ������ �ν��Ͻ� ���� ����Ǿ�
		// 1�� �����Ǹ鼭 ������ ����ȴ�
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		// �����ڰ� �ϳ� �ۿ� ���� ������ �ν��Ͻ� �� ���, productŬ������ �����ڸ� ����ص� ����� ������,
		// �ڵ��� �ǹ̻� ���� �����ڿ��� �������� ����Ǿ�� �ϴ� �����̱� ������ �ν��Ͻ� �� ���
		// ���� count�� �ν��Ͻ� ������ �����ߴٸ� �ν��Ͻ��� ������ ������ 0���� �ʱ�ȭ �ɰ��̹Ƿ�
		// ��� product�ν��Ͻ��� serialNo�� �׻� 1�� �ɰ��̴�
		System.out.println("p1�� ��ǰ��ȣ�� " + p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ�� " + p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� " + Product.count + "�� �Դϴ�");

	}

}

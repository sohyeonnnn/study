package ch6;

//static�� �پ������� Ŭ�����޼���, �ƴϸ� �ν��Ͻ��޼���
//�ν��Ͻ� �޼���: �ν��Ͻ� ������ ���õ� �۾��� �ϴ�, �� �޼����� �۾��� �����ϴµ� �ν��Ͻ� ������ �ʿ���ϴ� �޼���
//Ŭ���� �޼���: �ν��Ͻ��� ������� �޼��� 

//1.Ŭ������ �����Ҷ� ������� �� ��� �ν��Ͻ��� �������� ����ϴ� �Ϳ� static�� ���δ�
//2.Ŭ���� ������ �ν��Ͻ��� �������� �ʾƵ� ����� �� �ִ�
//3.Ŭ�����޼���� �ν��Ͻ� ������ ����Ҽ�����
//4.�޼��� ������ �ν��Ͻ� ������ ������� �ʴ´ٸ�, static�� ���̴� ���� ����Ѵ�


class MyMath2 {
	long a,b;
	
	//�ν��Ͻ� ���� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����
	long add() {return a+b;} //a,b�� �ν��Ͻ� ����
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//�ν��Ͻ������� ������� �Ű����������� �۾��� �����ϴ�
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a,long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}

class MyMathTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ű������� �ָ鼭 ����
		System.out.println(MyMath2.add(200l, 100l));
		System.out.println(MyMath2.subtract(200l, 100l));
		System.out.println(MyMath2.multiply(200l, 100l));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2(); //��ü���� - > �� ����
		mm.a=200l; 
		mm.b=100l;
		
		//�ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������
		//mm��ü�� ������ �۾�
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}

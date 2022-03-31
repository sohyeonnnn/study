package ch14;

@FunctionalInterface
interface MyFunction { // �Լ��� �������̽�
	void run(); // public abstract void run();
}

class LambdaEx1 {
	static void execute(MyFunction f) { // �Ű������� Ÿ���� MyFunction�� �޼���
		f.run();
	}

	static MyFunction getMyFunction() { // ��ȯŸ���� MyFunction�� �޼���
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ٽ����� MyFunction�� run()�� ����
		MyFunction f1 = () -> System.out.println("f1.run()");

		// �͸�Ŭ������ run()�� ����
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute(() -> System.out.println("run()"));
	}

}

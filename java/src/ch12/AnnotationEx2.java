package ch12;

class NewClass {
	int newField;

	int getNewField() {
		return newField;
	}

	
	//Deprecated - �� �̻� ������ �ʴ� �ʵ峪 �޼��忡 ���δ�, ������� �ʵ��� ���� �� �������� ����
	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() {
		return oldField;
	}
}

class AnnotationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();

		nc.oldField = 10;
		System.out.println(nc.getOldField());
	}

}

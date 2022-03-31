package ch12;

class NewClass {
	int newField;

	int getNewField() {
		return newField;
	}

	
	//Deprecated - 더 이상 사용되지 않는 필드나 메서드에 붙인다, 사용하지 않도록 권할 뿐 강제성은 없음
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

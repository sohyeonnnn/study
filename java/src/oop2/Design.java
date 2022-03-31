package oop2;

import java.util.HashMap;
import java.util.Map;

// ���������� 
// ������, ���յ�
// api ª��
// pojo

public class Design {

	private String name; // ������ �̸�
	private Map<String, Object> design = new HashMap<>();

	private Roof roof = new Roof();
	private Window window = new Window();
	private Door door = new Door();

	// ������� �߰� - ����, ����, ����...
	// 1. Design Ŭ������ ���� �߰��ϰ� �ش���׾����� null�� - ������ ������ ���
	// 2. Design�� ����ϴ� Ŭ���� ����

	// map
	// ���� �����ϴ� ����� ������ ��������
	// Ŭ������ ���� - ���ո��� Ŭ���� ����

	public Design() { // �⺻ : ����-����, â��-�׸�, ��-�׸�

		name = "Default";

		roof.setColor("black");
		window.setShape("square");
		door.setShape("square");

		design.put("Roof", roof);
		design.put("Window", window);
		design.put("Door", door);
	}

	public Design(String name, Map<String, Object> design) {
		super();
		this.name = name;
		this.design = design;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getDesign() {
		return design;
	}

	public void setDesign(Map<String, Object> design) {
		this.design = design;
	}

}

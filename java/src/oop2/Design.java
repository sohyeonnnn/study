package oop2;

import java.util.HashMap;
import java.util.Map;

// 접근제어자 
// 응집도, 결합도
// api 짧게
// pojo

public class Design {

	private String name; // 디자인 이름
	private Map<String, Object> design = new HashMap<>();

	private Roof roof = new Roof();
	private Window window = new Window();
	private Door door = new Door();

	// 멤버변수 추가 - 층수, 마당, 굴뚝...
	// 1. Design 클래스에 변수 추가하고 해당사항없으면 null로 - 변수가 많아질 경우
	// 2. Design을 상속하는 클래스 생성

	// map
	// 집을 구성하는 요소의 조합이 여러가지
	// 클래스를 생성 - 조합마다 클래스 생성

	public Design() { // 기본 : 지붕-검정, 창문-네모, 문-네모

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

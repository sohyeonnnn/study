package oop2;

import java.util.HashMap;
import java.util.Map;

public class BuildHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Roof roof = new Roof();
		Window window = new Window();
		Door door = new Door();

		// 지붕: red , 창문: circle, 문: square 인 designMap생성
		roof.setColor("red");
		window.setShape("circle");
		door.setShape("square");

		Map<String, Object> designMap1 = new HashMap<>();
		designMap1.put("Roof", roof);
		designMap1.put("Window", window);
		designMap1.put("Door", door);

		Design Design1 = new Design("design1", designMap1);

		House h1 = new House("house1", Design1); // design1으로 h1 생성

		System.out.println(h1.toString());
	}

}

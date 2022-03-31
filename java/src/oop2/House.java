package oop2;

class House {
	private String name;
	private Design design;

	public House(String name, Design design) {
		
		this.name = name;
		this.design = design;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	public String toString() {
		return "[�̸�] : " + name + ", [����] : " + design.getDesign().get("Roof").toString() + ", [â��] : "
				+ design.getDesign().get("Window").toString() + ", [��] : " + design.getDesign().get("Door").toString();
	}

}

package oop;

public class HousePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseInterface redHouse = new RedHouse();
		HouseInterface blueHouse = new BlueHouse();
		HouseInterface blackHouse = new BlackHouse();

		redHouse.printInfo();
		blueHouse.printInfo();
		blackHouse.printInfo();
	}

}

package ch12;

enum Direction {
	EAST, SOUTH, WEST, NORTH
}

public class EnumEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direction d1 = Direction.EAST; // EAST
		Direction d2 = Direction.valueOf("WEST"); // ������ ���������� name�� ��ġ�ϴ� ������ ����� ��ȯ
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);

		System.out.println("d1==d2 ? " + (d1 == d2));
		System.out.println("d1==d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
		// �ε�ȣ �񱳴� �Ұ���

		switch (d1) {
		case EAST:
			System.out.println("The direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH");
			break;
		case WEST:
			System.out.println("The direction is WEST");
			break;
		case NORTH:
			System.out.println("The direction is NORTH");
			break;
		default:
			System.out.println("Invalid direction");
			break;
		}

		Direction[] dArr = Direction.values();

		for (Direction d : dArr) {
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
			// name : ������ ����� �̸��� ���ڿ��� ��ȯ
			// ordinal : ������ ����� ���ǵ� ������ ��ȯ(0���� ����)
		}
	}

}

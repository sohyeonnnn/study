package ch4;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.printf("x=%d �϶�, ���� ���� %n", x);

		if (x == 0)
			System.out.println("x==0"); // t
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)"); // t

		x = 1;
		System.out.printf("x=%d �϶�, ���� ���� %n", x);

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0"); // t
		if (!(x == 0))
			System.out.println("!(x==0)"); // t
		if (!(x != 0))
			System.out.println("!(x!=0)");

	}

}

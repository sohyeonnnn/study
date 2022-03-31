package ch15;

public class StrandardIOEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int input = 0;

			while ((input = System.in.read()) != -1) {
				System.out.println("input:" + input + ",(char)input:" + (char) input);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

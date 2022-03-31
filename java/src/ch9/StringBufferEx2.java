package ch9;

public class StringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("01"); //01
		StringBuffer sb2 = sb.append(23); ///0123
		sb.append('4').append(56); //0123456

		StringBuffer sb3 = sb.append(78); //012345678
		sb3.append(9.0); //0123456789.0

		System.out.println("sb=" + sb);
		System.out.println("sb2=" + sb2);
		System.out.println("sb3=" + sb3);

		System.out.println("sb=" + sb.deleteCharAt(10)); //10번째 문자 지움
		System.out.println("sb=" + sb.delete(3, 6)); //3~5번째 문자 지움
		System.out.println("sb=" + sb.insert(3, "abc")); //3번째에 abc 추가
		System.out.println("sb=" + sb.replace(6, sb.length(), "END")); //6번째부터 끝까지 END로 바꿈

		System.out.println("capacity=" + sb.capacity());
		System.out.println("length=" + sb.length());
	}

}

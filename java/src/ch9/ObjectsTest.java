package ch9;

import java.util.*;
import static java.util.Objects.*;

public class ObjectsTest {

	public static void main(String[] args) {
		String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D_2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.print("str2D ={");

		for (String[] tmp : str2D) {
			System.out.print(Arrays.toString(tmp));
		}
		System.out.println("}");

		System.out.print("str2D_2={");
		for (String[] tmp : str2D_2) {
			System.out.print(Arrays.toString(tmp));
		}
		System.out.println("}");

		System.out.println("equals(str2D,str2D_2)=" + Objects.equals(str2D, str2D_2)); // false
		// deepEquals - equals+ 반복문
		System.out.println("deepEquals(str2D,str2D_2)=" + Objects.deepEquals(str2D, str2D_2)); // true
		System.out.println("isNull(null)=" + isNull(null));
		System.out.println("nonNull(null)=" + nonNull(null));
		System.out.println("hashCode(null)=" + Objects.hashCode(null)); // null이면 0
		System.out.println("toString(null)=" + Objects.toString(null));
		System.out.println("toString(null,\"\")=" + Objects.toString(null, ""));

		Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자 구분 안하는 비교
		// 두 비교대상이 같으면 0, 크면 양수, 작으면 음수

		System.out.println("compare(\"aa\",\"bb\")=" + compare("aa", "bb", c));
		System.out.println("compare(\"bb\",\"aa\")=" + compare("bb", "aa", c));
		System.out.println("compare(\"ab\",\"AB\")=" + compare("ab", "AB", c)); // 같음

	}

}

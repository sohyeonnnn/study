package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);

		for (int i = 0; i < 10; i++) {
			original.add(i + ""); // original 0 1 2 3 4 5 6 7 8 9
		}
		Iterator it = original.iterator();
		while (it.hasNext()) {
			copy1.add(it.next()); // copy1 0 1 2 3 4 5 6 7 8 9
		}
		System.out.println("= original에서 copy1로 복사(copy)");
		System.out.println("original:" + original);
		System.out.println("copy1:" + copy1);
		System.out.println();

		it = original.iterator(); // 재사용이 안된다

		while (it.hasNext()) {
			copy2.add(it.next()); // copy2에 추가하고
			it.remove(); // origianl에서 삭제
		}

		System.out.println("=original에서 copy2로 이동(move)=");
		System.out.println("original:" + original);
		System.out.println("copy2:" + copy2);
	}

}

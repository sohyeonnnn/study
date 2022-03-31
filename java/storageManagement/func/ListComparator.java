package func;

import java.util.Comparator;

import vo.Cell;

public class ListComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Cell cell1 = (Cell) o1;
		Cell cell2 = (Cell) o2;

		double priority1 = cell1.getItem().getItemPriority();
		double priority2 = cell2.getItem().getItemPriority();

		if (priority1 > priority2) {
			return -1;
		} else if (priority1 < priority2) {
			return 1;
		} else {
			return 0;
		}
	}
}

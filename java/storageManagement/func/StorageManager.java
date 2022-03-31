package func;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import vo.Cell;
import vo.Storage;

public class StorageManager {

	Storage storage;

	private void makeNewStorage(int rowSize, int colSize) {
		storage = new Storage(rowSize, colSize);
	}

	protected void callMakeNewStorage(String size) {
		StringTokenizer st = new StringTokenizer(size, "*");
		int rowSize = Integer.parseInt(st.nextToken());
		int colSize = Integer.parseInt(st.nextToken());
		makeNewStorage(rowSize, colSize);
	}

	protected void printResult() {

		List<Cell> cellList = storage.getCellList();

		// priority 내림차순으로 정렬 후
		Collections.sort(cellList, new ListComparator());

		// print
		System.out.println("================");
		printCellPriorityDesc('E');
		printCellPriorityDesc('P');
	}

	private void printCellPriorityDesc(char state) {
		CellManager cellManager = new CellManager();
		List<Cell> cellList = storage.getCellList();
		int size = cellList.size();
		Cell cell;
		for (int i = 0; i < size; i++) {
			cell = cellList.get(i);
			if (cell.getCellState() == state) {
				cellManager.printCellInfo(cellList.get(i));
			}
		}
	}

	protected void setCellList(List<Cell> cellList) {
		storage.setCellList(cellList);
	}

	protected int getStorageRowSize() {
		return storage.getRowSize();
	}

	protected int getStorageColSize() {
		return storage.getColSize();
	}

}

package func;

import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import vo.Cell;
import vo.Item;

public class CellManager {

	Cell cell;
	List<Cell> cellList;

	protected List<Cell> makeCellAndReturnCellList(StringTokenizer userInputTokens, int i, int colSize,
			List<Cell> cellList, Map<String, Item> itemMap) {
		ItemManager itemManager = new ItemManager();
		Item item;

		for (int j = 1; j <= colSize; j++) {
			item = itemManager.returnItem(userInputTokens.nextToken(), itemMap);
			cellList.add(new Cell(item, i, j));
		}
		return cellList;
	}

	protected void setCellState(StringTokenizer userInputTokens, List<Cell> cellList, int colSize, int i) {
		for (int j = 1; j <= colSize; j++) {
			// 해당 cell 찾아서 state 설정
			returnCell(i, j, cellList).setCellState(userInputTokens.nextToken().charAt(0));
		}
	}

	private Cell returnCell(int rowPosition, int colPosition, List<Cell> cellList) {
		for (int i = 0; i < cellList.size(); i++) {
			if (checkPosition(cellList, i, rowPosition, colPosition)) {
				return cellList.get(i);
			}
		}
		return null;
	}

	private boolean checkPosition(List<Cell> cellList, int i, int row, int col) {
		return cellList.get(i).getRowPosition() == row && cellList.get(i).getColPosition() == col;
	}

	protected void printCellInfo(Cell cell) { // cell로 옮기기
		cell.printCellInfo();
	}

}

package vo;

import java.util.ArrayList;
import java.util.List;

public class Storage {

	private int rowSize;
	private int colSize;
	private List<Cell> cellList = new ArrayList<>();

	public Storage(int rowSize, int colSize) {
		this.rowSize = rowSize;
		this.colSize = colSize;
	}

	public int getRowSize() {
		return rowSize;
	}

	public int getColSize() {
		return colSize;
	}

	public List<Cell> getCellList() {
		return cellList;
	}

	public void setCellList(List<Cell> cellList) {
		this.cellList = cellList;
	}

}

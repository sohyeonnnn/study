package vo;

public class Cell {

	private Item item;
	private char cellState;
	private int rowPosition;
	private int colPosition;

	public Cell(Item item, int rowPosition, int colPosition) {
		this.item = item;
		this.rowPosition = rowPosition;
		this.colPosition = colPosition;
	}

	public char getCellState() {
		return cellState;
	}

	public void setCellState(char cellState) {
		this.cellState = cellState;
	}

	public Item getItem() {
		return item;
	}

	public int getRowPosition() {
		return rowPosition;
	}

	public int getColPosition() {
		return colPosition;
	}

	public void printCellInfo() {
		System.out.print(cellState + " - ");
		System.out.print(item.getItemName() + " ");
		System.out.print(item.getItemPriority() + " ");
		System.out.print("(" + rowPosition + ",");
		System.out.println(colPosition + ")");
	}

}

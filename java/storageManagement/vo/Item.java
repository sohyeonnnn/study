package vo;

public class Item {

	private String itemName;
	private double itemPriority;

	public Item(String itemName, double itemPriority) {
		this.itemName = itemName;
		this.itemPriority = itemPriority;
	}

	public double getItemPriority() {
		return itemPriority;
	}

	public String getItemName() {
		return itemName;
	}

}

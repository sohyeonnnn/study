package func;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vo.Item;

public class ItemManager {

	///////////////
	private Item a;
	private Item b;
	private Item c;
	private Item d;
	private Item e;
	///////////////

	private Map<String, Item> itemMap = new HashMap<>();

	public Map<String, Item> getItemMap() {
		return itemMap;
	}

	private Map<String, Item> setItemPriority(List<Double> priorityList) {
		a = new Item("A", priorityList.get(0));
		b = new Item("B", priorityList.get(1));
		c = new Item("C", priorityList.get(2));
		d = new Item("D", priorityList.get(3));
		e = new Item("E", priorityList.get(4));

		itemMap.put("A", a);
		itemMap.put("B", b);
		itemMap.put("C", c);
		itemMap.put("D", d);
		itemMap.put("E", e);

		return itemMap;
	}

	protected Map<String, Item> callSetItemPriority(List<Double> priorityList) {
		return setItemPriority(priorityList);
	}

	protected Item returnItem(String item, Map<String, Item> itemMap) {
		return itemMap.get(item);
	}

}

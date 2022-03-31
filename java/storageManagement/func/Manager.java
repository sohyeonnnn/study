package func;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import vo.Cell;
import vo.Item;
import vo.Storage;

public class Manager {

	Scanner sc = new Scanner(System.in);

	private ItemManager itemManager = new ItemManager();
	private CellManager cellManager = new CellManager();
	private StorageManager storageManager = new StorageManager();

	// ����� �Է°��� ��ū���� ������ return
	private StringTokenizer userInputToTokens() {
		String userInput = sc.nextLine();
		return new StringTokenizer(userInput, " ");
	}

	// �켱���� set
	private List<Double> inputAndReturnItemPriority() {
		System.out.print("[INPUT PRIORITY] > ");
		StringTokenizer userInputTokens = userInputToTokens();
		List<Double> priorityList = new ArrayList<>();
		while (userInputTokens.hasMoreTokens()) {
			priorityList.add(Double.parseDouble(userInputTokens.nextToken()));
		}
		return priorityList;
	}

	// ũ�� set
	private String inputAndReturnStorageSize() {
		System.out.print("[INPUT STORAGE SIZE (row*col)] > ");
		StringTokenizer userInputTokens = userInputToTokens();
		return userInputTokens.nextToken() + "*" + userInputTokens.nextToken();
	}

	// ��ġ set
	private List<Cell> inputItemPositionAndReturnCellList(int rowSize, int colSize, Map<String, Item> itemMap) {
		StringTokenizer userInputTokens;
		List<Cell> cellList = new ArrayList<>();

		for (int i = 1; i <= rowSize; i++) {
			System.out.print("[INPUT ITEM row: " + i + "] > ");
			userInputTokens = userInputToTokens(); // �Է¹���
			cellManager.makeCellAndReturnCellList(userInputTokens, i, colSize, cellList, itemMap);
		}

		return cellList;
	}

	// ���� set
	private void inputAndSetCellState(int rowSize, int colSize, List<Cell> cellList) {
		StringTokenizer userInputTokens;

		for (int i = 1; i <= rowSize; i++) {
			System.out.print("[INPUT STATE row: " + i + "] > ");
			userInputTokens = userInputToTokens(); // �Է¹���
			cellManager.setCellState(userInputTokens, cellList, colSize, i);
		}
	}

	protected void start() {
		Map<String, Item> itemMap = itemManager.callSetItemPriority(inputAndReturnItemPriority()); // �켱���� �Է� �� ����
		storageManager.callMakeNewStorage(inputAndReturnStorageSize()); // ũ�� �Է� �� storage ����

		int rowSize = storageManager.getStorageRowSize();
		int colSize = storageManager.getStorageColSize();

		List<Cell> cellList = inputItemPositionAndReturnCellList(rowSize, colSize, itemMap); // item �Է¹޾Ƽ� cell�� ����

		inputAndSetCellState(rowSize, colSize, cellList); // state ����

		storageManager.setCellList(cellList); // storage�� cellList ����
		storageManager.printResult(); // �켱���� ������������ ���

	}

}

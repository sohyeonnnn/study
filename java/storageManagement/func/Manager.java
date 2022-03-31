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

	// 사용자 입력값을 토큰으로 나눠서 return
	private StringTokenizer userInputToTokens() {
		String userInput = sc.nextLine();
		return new StringTokenizer(userInput, " ");
	}

	// 우선순위 set
	private List<Double> inputAndReturnItemPriority() {
		System.out.print("[INPUT PRIORITY] > ");
		StringTokenizer userInputTokens = userInputToTokens();
		List<Double> priorityList = new ArrayList<>();
		while (userInputTokens.hasMoreTokens()) {
			priorityList.add(Double.parseDouble(userInputTokens.nextToken()));
		}
		return priorityList;
	}

	// 크기 set
	private String inputAndReturnStorageSize() {
		System.out.print("[INPUT STORAGE SIZE (row*col)] > ");
		StringTokenizer userInputTokens = userInputToTokens();
		return userInputTokens.nextToken() + "*" + userInputTokens.nextToken();
	}

	// 위치 set
	private List<Cell> inputItemPositionAndReturnCellList(int rowSize, int colSize, Map<String, Item> itemMap) {
		StringTokenizer userInputTokens;
		List<Cell> cellList = new ArrayList<>();

		for (int i = 1; i <= rowSize; i++) {
			System.out.print("[INPUT ITEM row: " + i + "] > ");
			userInputTokens = userInputToTokens(); // 입력받음
			cellManager.makeCellAndReturnCellList(userInputTokens, i, colSize, cellList, itemMap);
		}

		return cellList;
	}

	// 상태 set
	private void inputAndSetCellState(int rowSize, int colSize, List<Cell> cellList) {
		StringTokenizer userInputTokens;

		for (int i = 1; i <= rowSize; i++) {
			System.out.print("[INPUT STATE row: " + i + "] > ");
			userInputTokens = userInputToTokens(); // 입력받음
			cellManager.setCellState(userInputTokens, cellList, colSize, i);
		}
	}

	protected void start() {
		Map<String, Item> itemMap = itemManager.callSetItemPriority(inputAndReturnItemPriority()); // 우선순위 입력 후 설정
		storageManager.callMakeNewStorage(inputAndReturnStorageSize()); // 크기 입력 후 storage 생성

		int rowSize = storageManager.getStorageRowSize();
		int colSize = storageManager.getStorageColSize();

		List<Cell> cellList = inputItemPositionAndReturnCellList(rowSize, colSize, itemMap); // item 입력받아서 cell에 넣음

		inputAndSetCellState(rowSize, colSize, cellList); // state 설정

		storageManager.setCellList(cellList); // storage에 cellList 설정
		storageManager.printResult(); // 우선순위 내림차순으로 출력

	}

}

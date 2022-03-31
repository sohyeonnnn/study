package ch15;

import java.io.File;
import java.util.ArrayList;

public class FileEx3 {
	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("usage : java FileEx3 DIRECTORY");
			System.exit(0);
		}

		File dir = new File(args[0]);

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�");
			System.exit(0);
		}

		printFileList(dir);

		System.out.println();
		System.out.println("�� " + totalFiles + "���� ����");
		System.out.println("�� " + totalDirs + "���� ���丮");
	}

	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + " ���丮");
		File[] files = dir.listFiles();

		ArrayList subDir = new ArrayList();

		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName();

			if (files[i].isDirectory()) {
				filename = "[" + filename + "]";
				subDir.add(i + "");
			}
			System.out.println(filename);
		}

		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;

		totalFiles += fileNum;
		totalDirs += dirNum;

		System.out.println(fileNum + "���� ����, " + dirNum + "���� ���丮");
		System.out.println();

		for (int i = 0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String) subDir.get(i));
			printFileList(files[index]);
		}
	}

}


//����
//1.package��
//2.import��
//3.Ŭ��������

package ch7;

import java.util.Date;

import java.text.SimpleDateFormat; //import
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// import���� ������ Ŭ�����տ� ��Ű���� ���������
		// java.util.Date today = new java.util.Date();
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));

	}

}

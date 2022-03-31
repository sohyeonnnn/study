package ch7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//EventHandler를 익명클래스로 변경
public class Ex7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame();
		// f.addWindowListener(new EventHandler());
		
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}

/*
 * class EventHandler extends WindowAdapter { public void
 * windowClosing(WindowEvent e) { e.getWindow().setVisible(false);
 * e.getWindow().dispose(); System.exit(0);
 * 
 * }
 */

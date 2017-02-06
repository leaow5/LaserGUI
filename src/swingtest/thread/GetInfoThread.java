package swingtest.thread;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;

class GetInfoThread extends Thread {
	JComponent applet;

	Runnable runx;

	int value;

	public GetInfoThread(final JComponent applet) {
		this.applet = applet;
		runx = new Runnable() {
			public void run() {
				// JProgressBar jpb = applet.getProgressBar();
				// jpb.setValue(value);
			}
		};
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
				value = (int) (Math.random() * 100);
				System.out.println(value);
				SwingUtilities.invokeLater(runx);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
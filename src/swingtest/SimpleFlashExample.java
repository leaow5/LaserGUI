package swingtest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JFlashPlayer;

public class SimpleFlashExample {
	
	public SimpleFlashExample() {
		
	}

	public static JComponent createContent() {
		JFlashPlayer flashPlayer = new JFlashPlayer();
		flashPlayer.load(SimpleFlashExample.class,
				"resource/boot.swf");
		return flashPlayer;
	}

	/* Standard main method to try that test as a standalone application. */
	public static void main(String[] args) {
		NativeInterface.open();
		UIUtils.setPreferredLookAndFeel();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane()
						.add(createContent(), BorderLayout.CENTER);
				frame.setSize(800, 600);
				frame.setLocationByPlatform(true);
				frame.setUndecorated(true);
				Dimension screen = frame.getToolkit().getScreenSize(); // 得到屏幕尺寸
//				frame.pack(); // 窗口适应组件尺寸
				frame.setLocation((screen.width - frame.getSize().width) / 2,
						(screen.height - frame.getSize().height) / 2); // 设置窗口位置
				frame.setVisible(true);
				
				Thread thread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						MyFrame frame2 = new MyFrame();
						frame2.setVisible(true);
					}
				});
				try {
					thread.sleep(10000);
//					thread.start();
//					frame.dispose();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
//		NativeInterface.runEventPump();
	}
}

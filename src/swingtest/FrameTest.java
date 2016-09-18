package swingtest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FrameTest extends JFrame{
	
	public FrameTest() {
//		ImageIcon icon = new ImageIcon("resource//bgimg4.jpg");  
//		JLabel backImage = new JLabel(icon);
//		backImage.setBounds(0, 0, icon.getIconWidth(),
//				icon.getIconHeight());
		JPanel bgPanel = (JPanel) this.getContentPane();
//		bgPanel.setOpaque(false);
//		this.getLayeredPane().setLayout(null);
//		this.getLayeredPane().add(backImage, new Integer(Integer.MIN_VALUE));
//		bgPanel.setLayout(new BorderLayout());
		
		
		setResizable(false);
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 1024, 768);
		setSize(1024, 768);
		JPanel panel_Connect = new MyPanel();
		panel_Connect.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Connect",
				TitledBorder.LEADING, TitledBorder.TOP, null,
				SystemColor.desktop));
		panel_Connect.setToolTipText("Connect");
		panel_Connect.setBounds(10, 10, 280, 74);
		bgPanel.add(panel_Connect);
		panel_Connect.setLayout(null);

		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(69, 23, 91, 29);
		panel_Connect.add(btnConnect);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("COM1");
		comboBox.addItem("COM2");
		comboBox.addItem("COM3");
		comboBox.setBounds(170, 23, 91, 29);
		panel_Connect.add(comboBox);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTest frame = new FrameTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class MyPanel extends JPanel {
		 protected void paintComponent(Graphics g) {  
             ImageIcon icon = new ImageIcon("resource//bgimg4.jpg");  
             Image img = icon.getImage();  
             g.drawImage(img, 0, 0, icon.getIconWidth(),  
                     icon.getIconHeight(), icon.getImageObserver());  

         }  
	}
}

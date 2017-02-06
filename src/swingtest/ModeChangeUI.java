package swingtest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;
import org.jvnet.substance.skin.BusinessBlueSteelSkin;
import org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel;

public class ModeChangeUI extends JDialog {
	
	final ImageIcon icon_status = new ImageIcon("resource//status.png");
	final ImageIcon icon_c1 = new ImageIcon("resource//c1.png");
	final ImageIcon icon_c2 = new ImageIcon("resource//c2.png");
	final ImageIcon icon_c3 = new ImageIcon("resource//c3.png");
	final ImageIcon icon_c4 = new ImageIcon("resource//c4.png");
	final ImageIcon icon_c5 = new ImageIcon("resource//c5.png");
	final ImageIcon icon_c6 = new ImageIcon("resource//c6.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModeChangeUI frame = new ModeChangeUI(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public ModeChangeUI(Frame owner) {
        super(owner, true);
        init();
    }
	/**
	 * Create the frame.
	 */
	public void init() {

		setStyle();
		
		handleFrameAttr();
		
		handleContent();

	}
	/**
	 * 设置UI内容
	 */
	private void handleContent() {
		
		JPanel panel = new MyPanel();
		panel.setBounds(10, 74, 564, 304);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Channel 1:");
		lblNewLabel_1.setBounds(10, 10, 60, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblChannel = new JLabel("Channel 2:");
		lblChannel.setBounds(10, 44, 60, 30);
		panel.add(lblChannel);
		
		JLabel lblChannel_1 = new JLabel("Channel 3:");
		lblChannel_1.setBounds(10, 78, 60, 30);
		panel.add(lblChannel_1);
		
		JLabel lblChannel_2 = new JLabel("Channel 4:");
		lblChannel_2.setBounds(10, 112, 60, 30);
		panel.add(lblChannel_2);
		
		JLabel lblChannel_3 = new JLabel("Channel 5:");
		lblChannel_3.setBounds(10, 148, 60, 30);
		panel.add(lblChannel_3);
		
		JLabel lblChannel_4 = new JLabel("Channel 6:");
		lblChannel_4.setBounds(10, 183, 60, 30);
		panel.add(lblChannel_4);
		
		JLabel lblChannel_5 = new JLabel("Channel 7:");
		lblChannel_5.setBounds(10, 217, 60, 30);
		panel.add(lblChannel_5);
		
		JLabel lblChannel_6 = new JLabel("Channel 8:");
		lblChannel_6.setBounds(10, 257, 60, 30);
		panel.add(lblChannel_6);
		
		JLabel label_color1 = new JLabel(icon_c1);
		label_color1.setBounds(80, 10, 60, 30);
		panel.add(label_color1);
		
		JLabel lblWavelength = new JLabel("Wavelength(nm)");
		lblWavelength.setBounds(150, -10, 85, 30);
		lblWavelength.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblWavelength);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(150, 15, 85, 22);
		spinner.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(258, 15, 85, 22);
		panel.add(spinner_1);
		
		JLabel lblPower = new JLabel("Power(%)");
		lblPower.setBounds(258, -10, 85, 30);
		lblPower.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPower);
		
		JLabel lblActive = new JLabel("Active");
		lblActive.setBounds(369, -10, 85, 30);
		lblActive.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblActive);
		
		JButton btnNewButton = new JButton("ON");
		btnNewButton.setBounds(369, 15, 93, 23);
		panel.add(btnNewButton);
		
		JLabel label_status1 = new JLabel(icon_status);
		label_status1.setBounds(481, 10, 60, 30);
		panel.add(label_status1);
		
		JLabel label_color2 = new JLabel(icon_c2);
		label_color2.setBounds(80, 44, 60, 30);
		panel.add(label_color2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(150, 49, 85, 22);
		panel.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(258, 49, 85, 22);
		panel.add(spinner_3);
		
		JButton button = new JButton("ON");
		button.setBounds(369, 49, 93, 23);
		panel.add(button);
		
		JLabel label_status2 = new JLabel(icon_status);
		label_status2.setBounds(481, 44, 60, 30);
		panel.add(label_status2);
		
		JLabel label_color3 = new JLabel(icon_c3);
		label_color3.setBounds(80, 78, 60, 30);
		panel.add(label_color3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(150, 83, 85, 22);
		panel.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(258, 83, 85, 22);
		panel.add(spinner_5);
		
		JButton button_1 = new JButton("ON");
		button_1.setBounds(369, 83, 93, 23);
		panel.add(button_1);
		
		JLabel label_status3 = new JLabel(icon_status);
		label_status3.setBounds(481, 78, 60, 30);
		panel.add(label_status3);
		
		JLabel label_color4 = new JLabel(icon_c4);
		label_color4.setBounds(80, 112, 60, 30);
		panel.add(label_color4);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(150, 117, 85, 22);
		panel.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(258, 117, 85, 22);
		panel.add(spinner_7);
		
		JButton button_2 = new JButton("ON");
		button_2.setBounds(369, 117, 93, 23);
		panel.add(button_2);
		
		JLabel label_status4 = new JLabel(icon_status);
		label_status4.setBounds(481, 112, 60, 30);
		panel.add(label_status4);
		
		JLabel label_color5 = new JLabel(icon_c5);
		label_color5.setBounds(80, 148, 60, 30);
		panel.add(label_color5);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(150, 153, 85, 22);
		panel.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(258, 153, 85, 22);
		panel.add(spinner_9);
		
		JButton button_3 = new JButton("ON");
		button_3.setBounds(369, 153, 93, 23);
		panel.add(button_3);
		
		JLabel label_status5 = new JLabel(icon_status);
		label_status5.setBounds(481, 148, 60, 30);
		panel.add(label_status5);
		
		JLabel label_color6 = new JLabel(icon_c6);
		label_color6.setBounds(80, 183, 60, 30);
		panel.add(label_color6);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(150, 188, 85, 22);
		panel.add(spinner_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(258, 188, 85, 22);
		panel.add(spinner_11);
		
		JButton button_4 = new JButton("ON");
		button_4.setBounds(369, 188, 93, 23);
		panel.add(button_4);
		
		JLabel label_status6 = new JLabel(icon_status);
		label_status6.setBounds(481, 183, 60, 30);
		panel.add(label_status6);
		
		JLabel label_color7 = new JLabel(icon_c6);
		label_color7.setBounds(80, 217, 60, 30);
		panel.add(label_color7);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(150, 222, 85, 22);
		panel.add(spinner_12);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setBounds(258, 222, 85, 22);
		panel.add(spinner_13);
		
		JButton button_5 = new JButton("ON");
		button_5.setBounds(369, 222, 93, 23);
		panel.add(button_5);
		
		JLabel label_status7 = new JLabel(icon_status);
		label_status7.setBounds(481, 217, 60, 30);
		panel.add(label_status7);
		
		JLabel label_color8 = new JLabel(icon_c6);
		label_color8.setBounds(80, 257, 60, 30);
		panel.add(label_color8);
		
		JSpinner spinner_14 = new JSpinner();
		spinner_14.setBounds(150, 262, 85, 22);
		panel.add(spinner_14);
		
		JSpinner spinner_15 = new JSpinner();
		spinner_15.setBounds(258, 262, 85, 22);
		panel.add(spinner_15);
		
		JButton button_6 = new JButton("ON");
		button_6.setBounds(369, 262, 93, 23);
		panel.add(button_6);
		
		JLabel label_status8 = new JLabel(icon_status);
		label_status8.setBounds(481, 257, 60, 30);
		panel.add(label_status8);
		
		JPanel panel_1 = new MyPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		JLabel lblNewLabel = new JLabel("LOGO ICON");
		panel_1.add(lblNewLabel);
		lblNewLabel.setBounds(10, 10, 564, 54);
		
	}

	private void handleFrameAttr() {
		setSize(570, 367);
		setTitle("安扬 AOTF Controller");
		Dimension screen = getToolkit().getScreenSize(); // 得到屏幕尺寸
		setLocation((screen.width - getSize().width) / 2,
				(screen.height - getSize().height) / 2); // 设置窗口位置
	}
	
	private void setStyle() {
		SubstanceSkin skin = new BusinessBlueSteelSkin(); // 初始化有水印的皮肤

		try {
			UIManager
					.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		SubstanceLookAndFeel.setSkin(skin);
	}

}

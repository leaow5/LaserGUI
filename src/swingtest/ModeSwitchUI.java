package swingtest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;
import org.jvnet.substance.skin.BusinessBlueSteelSkin;
import org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel;

import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import java.awt.Font;

public class ModeSwitchUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton db25ModeButton;
	JRadioButton rs232ModeButton;
	JRadioButton gateModeButton;
	JButton okButton ;
	JButton cancelButton;
	MyFrame parent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModeSwitchUI frame = new ModeSwitchUI(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ModeSwitchUI(MyFrame owner) {
		super(owner, true);
		this.parent = owner;
        init();
	}
	
	private void init() {
		
		setStyle();
		
		handleFrameAttr();
		
		handleContent();
		
		handleOkEvent();
		
		handleCancelEvent();
		
	}

	private void handleContent() {
		JPanel contentPanel = new MyPanel();
		contentPanel.setToolTipText("Control Interface");
		setTitle("Mode Switch");
//		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new MyPanel();
			panel.setBorder(new TitledBorder(null, "Control Interface", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			db25ModeButton = new JRadioButton("DB25 Mode");
			db25ModeButton.setBounds(16, 22, 121, 23);
			panel.add(db25ModeButton);
			
			rs232ModeButton = new JRadioButton("RS232 Control Interface");
			rs232ModeButton.setBounds(234, 22, 163, 23);
			panel.add(rs232ModeButton);
			
			gateModeButton = new JRadioButton("GATE Mode");
			gateModeButton.setBounds(16, 47, 121, 23);
			panel.add(gateModeButton);
			
			ButtonGroup group = new ButtonGroup();
			group.add(db25ModeButton);
			group.add(rs232ModeButton);
			group.add(gateModeButton);
			
		}
		{
			JPanel buttonPane = new MyPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Apply for current");
				okButton.setFont(new Font("宋体", Font.PLAIN, 14));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("宋体", Font.PLAIN, 14));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	/**
	 * 确认
	 */
	private void handleOkEvent() {
		
		
		
		//TODO
		okButton.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				int mode = 1;
				boolean isDb25 = db25ModeButton.isSelected();
				boolean isGate = gateModeButton.isSelected();
				boolean isRS232 = rs232ModeButton.isSelected();
				if (isDb25) {
					mode = 1;
				} else if (isGate) {
					mode = 2;
				} else if (isRS232) {
					mode = 3;
				}
				parent.changeMode(mode);
				ModeSwitchUI.this.setVisible(false);
			}
		});
	}
	/**
	 * 取消
	 */
	private void handleCancelEvent() {
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ModeSwitchUI.this.setVisible(false);
			}
		});
	}

	private void handleFrameAttr() {
		setSize(450, 300);
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

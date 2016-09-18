package swingtest;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	 protected void paintComponent(Graphics g) {  
         ImageIcon icon = new ImageIcon("resource//bgimg2.jpg");  
         Image img = icon.getImage();  
         g.drawImage(img, 0, 0, icon.getIconWidth(),  
                 icon.getIconHeight(), icon.getImageObserver());  

     } 

}

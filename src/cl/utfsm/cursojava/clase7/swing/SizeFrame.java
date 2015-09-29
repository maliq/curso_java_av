package cl.utfsm.cursojava.clase7.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SizeFrame extends JFrame {
	
	public SizeFrame() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		
		setSize(width/4, height/4);
		setLocationByPlatform(true);
		
		
		Image image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		setIconImage(image);
		
		
	}
}

package cl.utfsm.cursojava.clase7.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ButtonFrameDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ButtonFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
	}

}

package cl.utfsm.cursojava.clase7.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SizeFrameDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				SizeFrame frame = new SizeFrame();
				frame.setTitle("Size Frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}

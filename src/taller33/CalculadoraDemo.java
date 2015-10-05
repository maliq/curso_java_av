package taller33;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CalculadoraDemo extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				CalculadoraPanel panel = new CalculadoraPanel();
				CalculadoraDemo frame = new CalculadoraDemo();
				frame.add(panel);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}

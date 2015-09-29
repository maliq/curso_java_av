package cl.utfsm.cursojava.clase7.swing.ejemplos;

import javax.swing.JFrame;
import javax.swing.JLabel;       

class HolaMundoSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Titulo de la ventana");
		JLabel label = new JLabel("Hola mundo!");
		frame.getContentPane().add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}


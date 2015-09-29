package cl.utfsm.cursojava.clase7.swing.ejemplos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JPane2 extends JFrame {

	public JPane2() {
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public void init() {
		Object[] valores = new Integer[15];
		for (int i = 0; i < 15; i++)
			valores[i] = new Integer(2000 + i);

		Integer st = (Integer) JOptionPane.showInputDialog(this, "elija el valor", "seleccion",
				JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

		System.out.println(st);

	}

	public static void main(String[] args) {
		new JPane2().setVisible(true);
	}

}

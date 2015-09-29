package cl.utfsm.cursojava.clase7.swing.ejemplos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JPane1 extends JFrame{

	public JPane1() {
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public void init() {
		int res = JOptionPane.showConfirmDialog(this, "Esta seguro?", "confirmacion", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE);

		if (res == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(this, "Dijo YES");
		else if (res == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(this, "Dijo NO");
		else if (res == JOptionPane.CANCEL_OPTION)
			JOptionPane.showMessageDialog(this, "Dijo CANCEL");
	}
	
	public static void main(String[] args) {
		new JPane1().setVisible(true);
	}

}

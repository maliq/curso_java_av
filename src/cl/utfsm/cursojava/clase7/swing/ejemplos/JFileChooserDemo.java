package cl.utfsm.cursojava.clase7.swing.ejemplos;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFileChooserDemo extends JFrame {

	public JFileChooserDemo() {
//		showSaveDialog();
		showOpenDialog1();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public void showSaveDialog() {
		JFileChooser fch = new javax.swing.JFileChooser();
		int res = fch.showSaveDialog(this);
		if(res==JFileChooser.APPROVE_OPTION)
			JOptionPane.showMessageDialog(
				this,
				fch.getSelectedFile().getName());
		else
			JOptionPane.showMessageDialog(
				this,
				"no aprobado!");
	}
	
	public void showOpenDialog() {
		JFileChooser fch = new javax.swing.JFileChooser();

		int res = fch.showOpenDialog(new JFrame());

		if(res==JFileChooser.APPROVE_OPTION)
			JOptionPane.showMessageDialog(
				this,
				fch.getSelectedFile().getName());
		else
			JOptionPane.showMessageDialog(
				this,
				"no aprobado!");

	}
	
	public void showOpenDialog1(){
		JFileChooser fch = new JFileChooser();
		int res = fch.showSaveDialog(this);
		
		if(res==JFileChooser.APPROVE_OPTION)
			JOptionPane.showMessageDialog(
				this,
				fch.getSelectedFile().getName());
		else
			JOptionPane.showMessageDialog(
				this,
				"no aprobado!");
	}

	public static void main(String[] args) {
		new JFileChooserDemo().setVisible(true);
	}

}

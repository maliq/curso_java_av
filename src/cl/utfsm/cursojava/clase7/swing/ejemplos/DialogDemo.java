package cl.utfsm.cursojava.clase7.swing.ejemplos;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class DialogDemo extends JDialog{

	private static final long serialVersionUID = 1L;
	private int cont;

	
	public DialogDemo(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		DialogDemo d = 
				new DialogDemo(new JFrame(), true);
		System.out.println(d.muestra());
	}
	
	public int muestra(){
		setVisible(true);
		return cont;
	}



}

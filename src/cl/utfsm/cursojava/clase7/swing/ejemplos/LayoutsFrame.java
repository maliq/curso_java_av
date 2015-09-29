package cl.utfsm.cursojava.clase7.swing.ejemplos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutsFrame extends JFrame {

	private JButton jButton1;
	private JTextField jTextField1;
	private JLabel jLabel1;

	public LayoutsFrame() {
		initComponents();
	}
	
	private void initComponents() {
		jButton1 = new JButton();
		jTextField1 = new JTextField();
	    jLabel1 = new JLabel();
	       
		getContentPane().setLayout(new java.awt.GridLayout(1, 0));
		        
		jButton1.setText("jButton1");
		getContentPane().add(jButton1);
		
		jTextField1.setText("jTextField1");
		getContentPane().add(jTextField1);
	       
		jLabel1.setText("jLabel1");
		getContentPane().add(jLabel1);
	      
		pack();
	}
	
	public static void main(String[] args) {
		new LayoutsFrame().setVisible(true);
	}


}

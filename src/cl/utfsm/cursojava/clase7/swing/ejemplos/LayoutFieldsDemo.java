package cl.utfsm.cursojava.clase7.swing.ejemplos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LayoutFieldsDemo extends JFrame{

	private JPanel jPanel2;

	public LayoutFieldsDemo() {
		jPanel2 = new JPanel();
		add(jPanel2);
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public void init(){
		JTextField jTextField1 = new JTextField();
		jTextField1.setColumns(10);
		jTextField1.setText("con texto");
		jPanel2.add(jTextField1);
		        
		JTextField jTextField2 = new JTextField();
		jTextField2.setBackground(java.awt.Color.GREEN);
		jTextField2.setColumns(15);
		Font f = new Font("Arial", Font.BOLD+Font.ITALIC, 10);
		jTextField2.setFont(f);
		jTextField2.setForeground(Color.RED);
		jTextField2.setText("colores");
		jPanel2.add(jTextField2);
		        
		JPasswordField jPasswordField1= new JPasswordField();
		jPasswordField1.setColumns(10);
		jPasswordField1.setText("hola");
		jPasswordField1.setEchoChar('?');
		String st = new String(jPasswordField1.getPassword());
		jPanel2.add(jPasswordField1);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LayoutFieldsDemo().setVisible(true);
			}
		});
	}

}

package cl.utfsm.cursojava.clase7.swing.ejemplos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelDemo extends JFrame{

	private JPanel jPanel1;

	public JLabelDemo() {
		jPanel1 = new JPanel();
		add(jPanel1);
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public void init(){
		JLabel jLabel1 = new JLabel();
		jLabel1.setBackground(java.awt.Color.blue);
		jLabel1.setForeground(java.awt.Color.red);
		jLabel1.setText("texto de la etiqueta");
		jPanel1.add(jLabel1);

		ImageIcon img;
		img=new ImageIcon("/Users/maliq/Documents/wsJavaAv/curso_java_av/src/cl/utfsm/cursojava/clase7/swing/logo.png"); 
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setIcon(img);
		jLabel2.setText("img desde archivo");
		jPanel1.add(jLabel2);

		img=new ImageIcon(getClass().getResource("../logo.png"));
		JLabel jLabel3 = new JLabel();
		jLabel3.setIcon(img);
		jLabel3.setText("img desde cp");
		jPanel1.add(jLabel3);

	}
	
	public static void main(String[] args) {
		new JLabelDemo().setVisible(true);
	}

}

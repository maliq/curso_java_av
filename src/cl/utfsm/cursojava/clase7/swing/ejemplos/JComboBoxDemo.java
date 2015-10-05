package cl.utfsm.cursojava.clase7.swing.ejemplos;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JComboBoxDemo extends JFrame{
	JPanel jPanel3;

	public JComboBoxDemo() {
		jPanel3 = new JPanel();
		add(jPanel3);
		ejemplo1();
//		ejemplo2();
//		ejemplo3();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public void ejemplo1(){
		String [] arr=new String[]{"a","b","c","d","e","f","g"};
		DefaultComboBoxModel<String> modelo;
		modelo = new DefaultComboBoxModel<String>(arr);
		final JComboBox<String> jComboBox1= new JComboBox<>();
		jComboBox1.setModel(modelo);
		jPanel3.add(jComboBox1);
		

		JButton jButton1 = new JButton("Mostrar");
		jButton1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				String seleccionado = (String) jComboBox1.getSelectedItem();
				JOptionPane.showMessageDialog(JComboBoxDemo.this,seleccionado);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
		jPanel3.add(jButton1);
	}
	
	public void ejemplo2(){
		JComboBox jComboBox2= new JComboBox<>();
		jComboBox2.setModel(modeloVector());
		jPanel3.add(jComboBox2);
	}
	
	private DefaultComboBoxModel<Integer> modeloVector(){
		Vector<Integer> v= new Vector<>();
		v.add(new Integer(1));
		v.add(new Integer(2));
		v.add(new Integer(3));
		v.add(new Integer(4));
		v.add(new Integer(5));
		DefaultComboBoxModel<Integer> m=new DefaultComboBoxModel<>(v);
		return m;
	}
	
	public void ejemplo3(){
		JComboBox jComboBox3= new JComboBox();
		jComboBox3.setModel(modeloItems());
		jPanel3.add(jComboBox3);
	}
	
	
	private DefaultComboBoxModel<ItemCombo> modeloItems(){
		Vector<ItemCombo> v = new Vector<>();
		v.add(new ItemCombo(1,5,"item 1"));
		v.add(new ItemCombo(2,4,"item 2"));
		v.add(new ItemCombo(3,3,"item 3"));
		v.add(new ItemCombo(4,2,"item 4"));
		v.add(new ItemCombo(5,1,"item 5"));
		return new DefaultComboBoxModel<ItemCombo>(v);
	}
	
	private class ItemCombo{
		private int i;
		private int j;
		private String n;
	        
		public ItemCombo(int i, int j, String n){
			this.i=i;
			this.j=j;
			this.n=n;
		}
		public String toString(){
			return i+".-"+n+" ("+j+")";
		}
	}



	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JComboBoxDemo().setVisible(true);
			}
		});
	}

}

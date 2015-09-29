package cl.utfsm.cursojava.clase7.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonFrame extends SizeFrame {
	private JPanel panel;
	public ButtonFrame() {
		super();
		JButton yButton = new JButton("amarillo");
		JButton bButton = new JButton("azul");
		JButton rButton = new JButton("rojo");
		panel = new JPanel();
		
		panel.add(yButton);
		panel.add(bButton);
		panel.add(rButton);
		
		yButton.addActionListener(new ColorAction(Color.YELLOW));
		bButton.addActionListener(new ColorAction(Color.BLUE));
		rButton.addActionListener(new ColorAction(Color.RED));
		
		
		add(panel);
		
		
	}
	
	private class ColorAction implements ActionListener{

		public ColorAction(Color color) {
			super();
			this.color = color;
		}

		private Color color;

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(color);
			
		}
	}	
}

package taller3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class CalculadoraPanel extends JPanel {
	public boolean start=true;
	public String ultimaOperacion="=";

	private class NumeroAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String numero = e.getActionCommand();
			if(start){
				display.setText("");
				start = false;
			}
			
			display.setText(display.getText()+numero);
		}

	}

	private class OperacionAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion = e.getActionCommand();
			
			if(start){
				if(operacion.equals("-")){
					display.setText(operacion);
					start = false;
				}else{
					ultimaOperacion = operacion;
				}
			}else{
				calculo(Double.parseDouble(display.getText()));
				ultimaOperacion = operacion;
				start = true;
			}

		}

	}

	private JButton display;
	private JPanel panel;
	private double resultado= 0;

	public CalculadoraPanel() {
		setLayout(new BorderLayout());
		

		// display
		display = new JButton("0");
		display.setEnabled(false);
		add(display, BorderLayout.NORTH);

		// numeros y opreaciones
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));

		addButton("7");
		addButton("8");
		addButton("9");
		addButton("/");

		addButton("4");
		addButton("5");
		addButton("6");
		addButton("*");

		addButton("1");
		addButton("2");
		addButton("3");
		addButton("-");

		addButton("0");
		addButton(".");
		addButton("=");
		addButton("+");

		add(panel, BorderLayout.CENTER);
	}

	public void calculo(double x) {
		switch (ultimaOperacion) {
		case "+":
			resultado += x;
			break;
		case "-":
			resultado -= x;
			break;
		case "*":
			resultado *= x;
			break;
		case "/":
			resultado /= x;
			break;
		case "=":
			resultado = x;
			break;
		default:
			break;
		}
		display.setText(""+resultado);
		
	}

	private void addButton(String label) {
		ActionListener listener;
		try {
			Integer.parseInt(label);
			listener = new NumeroAction();
		} catch (NumberFormatException nfe) {
			if(label.equals("."))
				listener = new NumeroAction();
			else
				listener = new OperacionAction();
		}

		JButton button = new JButton(label);
		button.addActionListener(listener);
		panel.add(button);
	}

}

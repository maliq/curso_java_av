package taller33;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalculadoraPanel extends JPanel {

	private JButton display;
	private JPanel panel;
	private boolean comienzo = true;
	private String ultimoOperador="=";
	private double resultado = 0;

	public CalculadoraPanel() {
		// Layout para pantalla
		setLayout(new BorderLayout());

		display = new JButton("0");
		display.setEnabled(false);
		add(display, BorderLayout.NORTH);

		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));

		agregarBoton("7");
		agregarBoton("8");
		agregarBoton("9");
		agregarBoton("+");

		agregarBoton("4");
		agregarBoton("5");
		agregarBoton("6");
		agregarBoton("-");

		agregarBoton("1");
		agregarBoton("2");
		agregarBoton("3");
		agregarBoton("*");

		agregarBoton("0");
		agregarBoton(".");
		agregarBoton("=");
		agregarBoton("/");

		add(panel, BorderLayout.CENTER);
	}

	private void agregarBoton(String label) {
		JButton boton = new JButton(label);
		NumeroListener listerner = new NumeroListener();
		OperacionListener operacionListener = new OperacionListener();
		try {
			Double.parseDouble(label);
			boton.addActionListener(listerner);
		} catch (Exception e) {
			if (label.equals(".")) {
				boton.addActionListener(listerner);
			} else {
				boton.addActionListener(operacionListener);
			}
		}
		panel.add(boton);
	}

	private class NumeroListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String numero = e.getActionCommand();
			System.out.println(numero);

			if (comienzo) {
				display.setText(numero);
				comienzo = false;
			} else {
				display.setText(display.getText() + numero);
			}
		}
	}

	private class OperacionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String operador = e.getActionCommand();
			System.out.println(operador);

			if (comienzo) {
				if (operador.equals("-")) {
					display.setText(operador);
					comienzo = false;
				} else {
					ultimoOperador = operador;
				}
			} else {
				calculo(Double.parseDouble(display.getText()));
				ultimoOperador = operador;
				comienzo = true;
			}

		}
	}

	private void calculo(Double d) {
		switch (ultimoOperador) {
		case "+":
			resultado += d;
			break;
		case "-":
			resultado -= d;
			break;
		case "*":
			resultado *= d;
			break;
		case "/":
			resultado /= d;
			break;
		case "=":
			resultado = d;
			break;
		default:
			break;
		}
		display.setText((new Double(resultado)).toString());
	}

}

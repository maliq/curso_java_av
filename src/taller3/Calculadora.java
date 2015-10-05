package taller3;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Calculadora extends JFrame{
	public Calculadora() {
		CalculadoraPanel calculadoraPanel = new CalculadoraPanel();
		add(calculadoraPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Calculadora().setVisible(true);
			}
		});
	}
}

package cl.utfsm.cursojava.clase7.swing.ejemplos;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBoton implements ActionListener {
	private Button b;

	public void init() {
		b = new Button("Presioname!");
		// Registro
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Super mal");

	}
	
	public static void main(String[] args) {
		new EventoBoton().init();
	}

}

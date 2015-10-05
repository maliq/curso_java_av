package cl.utfsm.cursojava.clase9.applet;

import java.awt.EventQueue;

import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 * Ejecuta un applet simple, se debe dejar en el src el archivo 
 * html que lo invoca, e invocar desde ahi 
 * appletviewer SimpleApplet.html
 * @author maliq
 *
 */

public class SimpleApplet extends JApplet{
	public void init(){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JLabel label = new JLabel("Hola mundo desde un applet");
				add(label);
			}
		});
	}

}

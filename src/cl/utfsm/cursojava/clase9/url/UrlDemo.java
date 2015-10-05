package cl.utfsm.cursojava.clase9.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {

	public UrlDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		URL inf;
		try {
			inf = new URL("http://www.inf.utfsm.cl/");
			System.out.println(inf.toExternalForm());

			URL personas = new URL(inf, "personas.html");
			URL personasBottom = new URL(personas, "#BOTTOM");
			System.out.println(personas.toExternalForm());
			System.out.println(personasBottom.toExternalForm());

			personas = new URL("http", "www.inf.utfsm.cl", "/personas.html");
			System.out.println(personas.toExternalForm());
			System.out.println(personas.getProtocol()+" - "+
				personas.getHost()+":"+
				personas.getPort()+"-"+
				personas.getPath());

			personas = new URL("http", "www.inf.utfsm.cl", 80, "/personas.html");
			System.out.println(personas.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}

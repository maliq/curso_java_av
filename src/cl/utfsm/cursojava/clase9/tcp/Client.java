package cl.utfsm.cursojava.clase9.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	private final static String HOST = "localhost";
	private final static int PORT = 1099;

	public static void main(String[] args) throws UnknownHostException, IOException {
//		getDate();
		getGreetings();

	}

	private static void getGreetings() throws UnknownHostException, IOException {
		String req = "greeting";
		try(Socket s = new Socket(HOST, PORT)){
			InputStream inputStream = s.getInputStream();
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println(req);
			Scanner in = new Scanner(inputStream);
			while(in.hasNextLine()){
				String line = in.nextLine();
				System.out.println("Server said: "+line);
			}
		} 
		
	}

	public static void getDate() {
		try {
			String req = "date";
			Socket s = new Socket(HOST, PORT);

			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			ps.println(req);
			String result = br.readLine();

			System.out.println("Server said: " + result);
			s.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

	}
}

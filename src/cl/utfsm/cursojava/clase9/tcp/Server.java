package cl.utfsm.cursojava.clase9.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
	public void connect(int port) throws IOException{
		Supplier supplier = new Supplier();
		ServerSocket socket = new ServerSocket(port);
		while(true){
			Socket s = socket.accept();
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			String line = br.readLine();
			String response;
			if(line.equals("date")){
				response = supplier.getDate();
			}else if(line.equals("greeting")){
				response = supplier.getGreeting();
			}else if(line.equals("wheater")){
				response = supplier.getWheater();
			}else if(line.equals("name")){
				response = supplier.getName();
			}else
				response="?";
			ps.println(response);
		}
	}
	public static void main(String[] args) throws IOException{
		Server server = new Server();
		server.connect(1099);
	}
	
	private class Supplier{

		public String getDate() {
			// TODO Auto-generated method stub
			return new Date().toString();
		}

		public String getName() {
			// TODO Auto-generated method stub
			return "Supplier :D";
		}

		public String getWheater() {
			// TODO Auto-generated method stub
			return "Is sunny";
		}

		public String getGreeting() {
			// TODO Auto-generated method stub
			return "Hi guys!";
		}
		
	}
}


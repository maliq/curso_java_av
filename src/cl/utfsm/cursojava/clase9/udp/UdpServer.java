package cl.utfsm.cursojava.clase9.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UdpServer {
	DatagramSocket socket = null;
	int portServer= 1098;

	public UdpServer() {
		try {
			socket = new DatagramSocket(portServer);
		} catch (java.io.IOException e) {
			System.err.println("No se pudo levantar el servidor.");
		}
	}

	public void serve() {
		while (socket != null) {
			byte[] buf = new byte[256];
			DatagramPacket packet;
			InetAddress address;
			int port;
			String dString = null;
			try {
				// recibir paquete
				packet = new DatagramPacket(buf, 256);
				socket.receive(packet);
				address = packet.getAddress();
				port = packet.getPort();
				// enviar respuesta
				dString = (new Date()).toString();
				buf = dString.getBytes();
				packet = new DatagramPacket(buf, buf.length, address, port);
				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		(new UdpServer()).serve();
	}
}

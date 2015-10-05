package cl.utfsm.cursojava.clase9.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
	public static void main(String[] args) {
		int port;
		InetAddress address;
		DatagramSocket socket = null;
		DatagramPacket packet;
		byte[] sendBuf = new byte[256];
		try {
			socket = new DatagramSocket();
		} catch (java.io.IOException e) {
			System.err.println("No se pudo crear la conexión.");
			return;
		}
		try { // enviar solicitud
			port = Integer.parseInt(args[1]);
			address = InetAddress.getByName(args[0]);
			packet = new DatagramPacket(sendBuf, 256, address, port);
			socket.send(packet);
			// obtener respuesta
			packet = new DatagramPacket(sendBuf, 256);
			socket.receive(packet);
			String received = new String(packet.getData(), 0, packet.getLength());
			System.out.println(received);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

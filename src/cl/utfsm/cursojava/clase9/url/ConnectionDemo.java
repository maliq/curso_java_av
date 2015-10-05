package cl.utfsm.cursojava.clase9.url;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectionDemo {

	public static void main(String[] args) {
		URL img;
		try {
//			img = new URL("http://www.utfsm.cl/img/UTFSM_banner-ex-umbra2.jpg");
			img = new URL("http://campus-virtual.utfsm.cl/header_moodle3.png");
			String file = img.getFile().replace('/', '_');
			URLConnection conn = img.openConnection();

			FileOutputStream fos = new FileOutputStream(file);
			InputStream is = conn.getInputStream();

			byte[] buffer = new byte[1024];
			int readed;
			do{
				readed = is.read(buffer);
				fos.write(buffer,0,readed);
			}while(readed==buffer.length);
			
			is.close();
			fos.close();
			System.out.println("Done");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

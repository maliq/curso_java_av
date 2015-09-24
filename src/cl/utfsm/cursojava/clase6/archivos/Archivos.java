package cl.utfsm.cursojava.clase6.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Archivos {

	public void escribirArchivo() {
		try {
			FileWriter fw = new FileWriter("archivo.txt");
			fw.write("Esta es una prueba");
			fw.close();
		} catch (IOException e) {
			System.out.println("Error de E/S:" + e);
		}
	}

	public void leerArchivo() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("archivo.txt");
			br = new BufferedReader(fr);
			String linea = br.readLine();
			System.out.println(linea);
		} catch (IOException e) {
			System.out.println("Error de E/S:" + e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
	}

	public void escribirArchivo2() {
		Path path = Paths.get("archivo2.txt");
		String linea = "Esta es una prueba2";
		try {
			Files.write(path, linea.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void leerArchivo2() {
		Path path = Paths.get("entrada.txt");
		try {
			List<String> lineas = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (String linea : lineas)
				System.out.println(linea);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void leerArchivo3() throws IOException {
		InputStream is = this.getClass().getResourceAsStream("test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
	}

	void leerEscribirArchivo(String entrada, String salida) throws IOException {
		Path pathEntrada = Paths.get(entrada);
		Path pathSalida = Paths.get(salida);

		ArrayList<String> lineas = new ArrayList<>();

		try (BufferedReader reader = Files.newBufferedReader(pathEntrada, StandardCharsets.UTF_8)) {
			String linea = "";
			while ((linea = reader.readLine()) != null) {
				lineas.add(linea);
				System.out.println(linea);
			}
		}

		try (BufferedWriter writer = Files.newBufferedWriter(pathSalida, StandardCharsets.UTF_8)) {
			for (String linea : lineas) {
				writer.write(linea);
				writer.newLine();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Archivos archivos = new Archivos();
		// archivos.escribirArchivo();
//		archivos.leerArchivo();
		archivos.leerArchivo3();
		// archivos.escribirArchivo2();
		// archivos.leerArchivo2();
		// try {
		// archivos.leerEscribirArchivo("entrada.txt", "salida.txt");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}

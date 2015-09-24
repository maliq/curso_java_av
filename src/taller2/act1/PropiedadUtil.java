package taller2.act1;

import java.io.IOException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class PropiedadUtil {

	public PropiedadUtil() {
			
	}
	
	public static Map<String,String> getPropiedades(URI uri){
		HashMap<String, String> map = new HashMap<>();
		Path dbFilePath = Paths.get(uri);
		List<String> lineas;
		try {
			lineas = Files.readAllLines(dbFilePath, StandardCharsets.UTF_8);
			for(String linea: lineas){
				StringTokenizer tokenizer= new StringTokenizer(linea, "=");
				String k = null,v = null;
				if(tokenizer.hasMoreTokens())
					k = tokenizer.nextToken().trim();
				if(tokenizer.hasMoreTokens())
					v = tokenizer.nextToken().trim();
				if(k !=null && v!=null)
					map.put(k, v);
				else
					throw new MalformedParameterizedTypeException();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
	public static Map<String,String> getPropiedades(){
		Path dbFilePath = Paths.get("src/taller2/db.txt");
		return getPropiedades(dbFilePath.toUri());
	}
	
	public static void main(String[] args) {
		Map<String, String> values = PropiedadUtil.getPropiedades();
		for (Map.Entry<String, String> entry: values.entrySet()) {
			  System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
			}
	}

}

package taller1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Actividad2 {

	public static void main(String[] args) {
		System.out.println("Ingrese una cadena de texto : ");
		   
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String s = bufferRead.readLine();
		    StringTokenizer tokenizer = new StringTokenizer(s, " "); 
		    while(tokenizer.hasMoreTokens()){
		    		String token = tokenizer.nextToken();
		    		System.out.println(token);
		    }
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

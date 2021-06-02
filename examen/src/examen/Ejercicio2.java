package examen;

import java.io.File;
import java.io.IOException;


public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		
		File arch = new File ("C:\\Users\\alumno\\Documents\\El Quijote ISO-8859-1.txt");
		 
		Frecuencia archivo = new Frecuencia(arch);
		archivo.leerFichero();
		archivo.frecuenciaPalabra("y");
	}

	
}

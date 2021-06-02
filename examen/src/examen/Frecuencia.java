package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Frecuencia {
	File file;
	List<String> palabras = new LinkedList<>();
	
	public Frecuencia(File file) {
		super();
		this.file = file;
	}

	public File getFile() {
		return file;
	}
	
	public void leerFichero() throws IOException {
		
		FileReader fr = new FileReader(this.file);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
			for (String p : linea.split(" ")) {
				palabras.add(p);
			}
		}		
	}
	public void frecuenciaPalabra(String pal) throws IOException {
		Iterator<String> it = palabras.iterator();
		int frecuencia=0;
		while(it.hasNext()) {
			if(it.equals(pal)) {
				frecuencia++;
			}
		}
		System.out.println("La palabra "+pal+" aparece en el texto "+frecuencia+" veces");
		
	}
	
	
}

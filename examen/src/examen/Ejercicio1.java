package examen;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {
	
	private static Set<Alumno> alumnos = new TreeSet<>();
	
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno("Maria", "Fernández González",LocalDate.parse("2000-07-06"), "DAW", 1);
		Alumno alumno1 = new Alumno("Luis", "García García",LocalDate.parse("2002-05-06"), "SIR", 1);
		Alumno alumno2 = new Alumno("Fernando", "Perez Escudero",LocalDate.parse("2003-05-06"), "DAW", 1);
		alumnos.add(alumno);
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		
		for(Alumno a:alumnos)
			System.out.println(a.getNombre()+" "+a.getApellidos()+"-"+a.getfNacimiento()+"-"+a.getCiclo()+"-"+a.getCurso());
		
		reordenar(alumnos);
		
	}
	
	
	public static void reordenar(Set<Alumno> alumnos) {
		Set<Alumno> alumnosReordenados = new TreeSet<>(new AlumnoComparator());
		Iterator<Alumno> it = alumnos.iterator();
		while(it.hasNext()) {
			alumnosReordenados.add(it.next());
		}
		for(Alumno b:alumnosReordenados)
			System.out.println(b.getNombre()+" "+b.getApellidos()+"-"+b.getfNacimiento()+"-"+b.getCiclo()+"-"+b.getCurso());
	}
	

}

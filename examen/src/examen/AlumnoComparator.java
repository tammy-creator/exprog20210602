package examen;

import java.util.Comparator;

public class AlumnoComparator implements Comparator<Alumno> {
	 
	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		 if (alumno1 == alumno2)
			return 0;
		 int resultado = alumno1.getCiclo().compareTo(alumno2.getCiclo());
		
		 if (resultado == 0)
			 resultado = alumno1.getApellidos().compareTo(alumno2.getApellidos());
		 if (resultado == 0)
			 resultado = alumno1.getNombre().compareTo(alumno2.getNombre());
		 return resultado;
	}
}

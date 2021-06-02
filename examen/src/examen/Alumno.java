package examen;

import java.time.LocalDate;

public class Alumno implements Comparable<Alumno> {
	private String nombre;
	private String apellidos;
	private LocalDate fNacimiento;
	private String ciclo;
	private Integer curso;
	
	public Alumno(String nombre, String apellidos, LocalDate fNacimiento, String ciclo, Integer curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNacimiento = fNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	
	@Override
	public int compareTo(Alumno alumno) {
		if (this == alumno)
			 return 0;
			 int resultado = apellidos.compareTo(alumno.apellidos);
			 if (resultado == 0)
			 resultado = nombre.compareTo(alumno.nombre);
			 return resultado;

	}
	
	
}

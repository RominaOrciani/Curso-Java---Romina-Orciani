package ResolucionEjercicio5;

import java.time.LocalDateTime;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDateTime fechadenacimiento;
	
	public Persona (String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	public String toString() {
		return this.getApellido()+", "+this.getNombre();
	}
	
	public Persona () {};
	
	public Persona(String nombre, String apellido,LocalDateTime fechadenacimiento) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechadenacimiento(fechadenacimiento);
	}
	
	
	public int edad() {
		return 0; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechadenacimiento() {
		return fechadenacimiento;
	}

	public void setFechadenacimiento(LocalDateTime fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}

}

package Banco;

public class Persona {

	String dni;
	String nombre;
	String apellido;
	Domicilio direccion;
	
	
	Persona(String nombre, String apellido, String dni, Domicilio direccion){
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setDireccion(direccion);
	}
	

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Domicilio getDireccion() {
		return direccion;
	}


	private void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ "]";
	}

	
	
	
	
	
}

package migueljuarez.model;

public class Usuario {

	private String Nombre;
	private String Contrasena;
	private String Email;
	private int Edad;
	
	
	public Usuario(String nombre, String contrasena, String email, int edad) {
		super();
		Nombre = nombre;
		Contrasena = contrasena;
		Email = email;
		Edad = edad;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getContrasena() {
		return Contrasena;
	}


	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
	
	
}

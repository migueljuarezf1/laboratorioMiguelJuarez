package migueljuarez.model;

public class Administrador extends Usuario {

	private String Perfil;

	public Administrador(String nombre, String contrasena, String email, int edad, String perfil) {
		super(nombre, contrasena, email, edad);
		Perfil = perfil;
	}

	public String getPerfil() {
		return Perfil;
	}

	public void setPerfil(String perfil) {
		Perfil = perfil;
	}
	
	
	
}

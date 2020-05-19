package migueljuarez.model;

public class Setup {

	private String Nombre;
	private String Descripcion;
	private String Foto;
	private int Valoracion;
	private String Categoria;
	
	
	public Setup(String nombre, String descripcion, String foto, int valoracion, String categoria) {
		super();
		Nombre = nombre;
		Descripcion = descripcion;
		Foto = foto;
		Valoracion = valoracion;
		Categoria = categoria;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public String getFoto() {
		return Foto;
	}


	public void setFoto(String foto) {
		Foto = foto;
	}


	public int getValoracion() {
		return Valoracion;
	}


	public void setValoracion(int valoracion) {
		Valoracion = valoracion;
	}


	public String getCategoria() {
		return Categoria;
	}


	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	
	
	
	
}

package migueljuarez.model;

public class Categoria {

	private String Nombre;
	private String Descripcion;
	private String Producto;
	
	
	
	public Categoria(String nombre, String descripcion, String producto) {
		super();
		Nombre = nombre;
		Descripcion = descripcion;
		Producto = producto;
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



	public String getProducto() {
		return Producto;
	}



	public void setProducto(String producto) {
		Producto = producto;
	}
	
	
	
	
}

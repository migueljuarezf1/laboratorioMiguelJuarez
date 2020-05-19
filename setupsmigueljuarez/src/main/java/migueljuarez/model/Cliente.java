package migueljuarez.model;

import java.time.LocalDate;

public class Cliente extends Usuario {

	private String Perfil;
	private LocalDate Fecha_Alta;
	private String Producto_Descargado;
	private String Producto_Compartido;
	private String Producto_Creado;
	
	
	public Cliente(String nombre, String contrasena, String email, int edad, String perfil, LocalDate fecha_Alta,
			String producto_Descargado, String producto_Compartido, String producto_Creado) {
		super(nombre, contrasena, email, edad);
		Perfil = perfil;
		Fecha_Alta = fecha_Alta;
		Producto_Descargado = producto_Descargado;
		Producto_Compartido = producto_Compartido;
		Producto_Creado = producto_Creado;
	}


	public String getPerfil() {
		return Perfil;
	}


	public void setPerfil(String perfil) {
		Perfil = perfil;
	}


	public LocalDate getFecha_Alta() {
		return Fecha_Alta;
	}


	public void setFecha_Alta(LocalDate fecha_Alta) {
		Fecha_Alta = fecha_Alta;
	}


	public String getProducto_Descargado() {
		return Producto_Descargado;
	}


	public void setProducto_Descargado(String producto_Descargado) {
		Producto_Descargado = producto_Descargado;
	}


	public String getProducto_Compartido() {
		return Producto_Compartido;
	}


	public void setProducto_Compartido(String producto_Compartido) {
		Producto_Compartido = producto_Compartido;
	}


	public String getProducto_Creado() {
		return Producto_Creado;
	}


	public void setProducto_Creado(String producto_Creado) {
		Producto_Creado = producto_Creado;
	}
	
	
	
	
}

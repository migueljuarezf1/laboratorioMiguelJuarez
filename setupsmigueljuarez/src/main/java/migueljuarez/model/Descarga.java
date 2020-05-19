package migueljuarez.model;

import java.time.LocalDate;

public class Descarga {

	private String Nombre_Producto;
	private LocalDate Descripcion;
	private String Formato_Descarga;
	private int Tama�o_Descarga;
	
	
	
	public Descarga(String nombre_Producto, LocalDate descripcion, String formato_Descarga, int tama�o_Descarga) {
		super();
		Nombre_Producto = nombre_Producto;
		Descripcion = descripcion;
		Formato_Descarga = formato_Descarga;
		Tama�o_Descarga = tama�o_Descarga;
	}



	public String getNombre_Producto() {
		return Nombre_Producto;
	}



	public void setNombre_Producto(String nombre_Producto) {
		Nombre_Producto = nombre_Producto;
	}



	public LocalDate getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(LocalDate descripcion) {
		Descripcion = descripcion;
	}



	public String getFormato_Descarga() {
		return Formato_Descarga;
	}



	public void setFormato_Descarga(String formato_Descarga) {
		Formato_Descarga = formato_Descarga;
	}



	public int getTama�o_Descarga() {
		return Tama�o_Descarga;
	}



	public void setTama�o_Descarga(int tama�o_Descarga) {
		Tama�o_Descarga = tama�o_Descarga;
	}
	
	
	
	
}

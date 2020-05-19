package migueljuarez.model;

import java.time.LocalDate;

public class Detalle_De_Descarga extends Descarga {

	private String Tamano_Descarga;
	private String Nombre_Archivo;
	public Detalle_De_Descarga(String nombre_Producto, LocalDate descripcion, String formato_Descarga,
			int tamaño_Descarga, String tamano_Descarga, String nombre_Archivo) {
		super(nombre_Producto, descripcion, formato_Descarga, tamaño_Descarga);
		Tamano_Descarga = tamano_Descarga;
		Nombre_Archivo = nombre_Archivo;
	}
	public String getTamano_Descarga() {
		return Tamano_Descarga;
	}
	public void setTamano_Descarga(String tamano_Descarga) {
		Tamano_Descarga = tamano_Descarga;
	}
	public String getNombre_Archivo() {
		return Nombre_Archivo;
	}
	public void setNombre_Archivo(String nombre_Archivo) {
		Nombre_Archivo = nombre_Archivo;
	}
	
	
	
	
	
	
}

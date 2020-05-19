package migueljuarez.model;

import java.time.LocalDate;

public class Comentarios extends Setup {

	private LocalDate Fecha;
	private String Mensaje;
	private int Valoracion;
	
	
	public Comentarios(String nombre, String descripcion, String foto, int valoracion, String categoria,
			LocalDate fecha, String mensaje, int valoracion2) {
		super(nombre, descripcion, foto, valoracion, categoria);
		Fecha = fecha;
		Mensaje = mensaje;
		Valoracion = valoracion2;
	}


	public LocalDate getFecha() {
		return Fecha;
	}


	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}


	public String getMensaje() {
		return Mensaje;
	}


	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}


	public int getValoracion() {
		return Valoracion;
	}


	public void setValoracion(int valoracion) {
		Valoracion = valoracion;
	}
	
	
	
	
}

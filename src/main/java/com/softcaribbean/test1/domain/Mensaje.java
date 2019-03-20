package com.softcaribbean.test1.domain;

public class Mensaje {

	private boolean estado;
	private String mensaje;

	public Mensaje() {

	}

	public Mensaje(boolean estado, String mensaje) {
		this.estado = estado;
		this.mensaje = mensaje;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Mensaje [estado=" + estado + ", mensaje=" + mensaje + "]";
	}

}
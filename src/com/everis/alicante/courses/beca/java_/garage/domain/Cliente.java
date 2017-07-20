package com.everis.alicante.courses.beca.java_.garage.domain;

public class Cliente {

	private String nif;
	private String nombreCompleto;
	private Vehiculo vehiculo;

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Datos cliente: nif=" + nif + ", Nombre Completo=" + " " + nombreCompleto + ", " + vehiculo;
	}

	public String convierteAFormatoTxt() {

		String str = "";
		str = str.concat(String.valueOf(this.nif));
		str = str.concat(";");
		str = str.concat(String.valueOf(this.nombreCompleto));
		str = str.concat(";");
		str = str.concat(this.getVehiculo().getMatricula());

		return str;
	}
}

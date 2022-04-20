package com.protalento.enumerados;

// private default protected y public  Tallas.L Tallas.M
public enum Tallas {
	XL(10, "Grande"), L(9, "Largo"), M(8, "Mediano"), S(5, "Pequeño"), SS(6, "Mas Pequeño"), SSS(7, "Muy pequeño"),
	XXL(11, "Mas Grande");

	private int equivalenciaArgentina;
	private String descripcion;

	private Tallas(int equivalenciaArgentina, String descripcion) {
		this.equivalenciaArgentina = equivalenciaArgentina;
		this.descripcion = descripcion;
	}

	/*
	 * public Tallas(int equivalenciaArgentina) { this.equivalenciaArgentina =
	 * equivalenciaArgentina; }
	 */
	/**
	 * @return the equivalenciaArgentina
	 */
	public int getEquivalenciaArgentina() {
		return equivalenciaArgentina;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// private

	// crear atributos y setearlos a traves de los setters o de los constructores

}

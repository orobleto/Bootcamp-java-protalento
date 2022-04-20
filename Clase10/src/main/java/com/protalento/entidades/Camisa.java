package com.protalento.entidades;

import com.protalento.enumerados.Tallas;
import com.protalento.excepciones.ErrorPersonalizado;
import com.protalento.excepciones.ErrorPersonalizado.CODIGOS_ERROR;;

public class Camisa extends Producto {
	private String marca;
	private int cantidad;
	private Tallas tallas;

	public Camisa() {

	}

	public Camisa(String marca, int cantidad, Tallas tallas) throws ErrorPersonalizado {
		super();
		this.marca = marca;
		setCantidad(cantidad);
		this.tallas = tallas;
	}

	@Override
	public String toString() {
		return "Camisa [marca=" + marca + ", cantidad=" + cantidad + ", tallas=" + tallas + " "
				+ tallas.getEquivalenciaArgentina() + " " + tallas.getDescripcion() + "]";
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 * @throws ErrorPersonalizado
	 */
	public void setCantidad(int cantidad) throws ErrorPersonalizado {
		if (cantidad == 0) {
			throw new ErrorPersonalizado(CODIGOS_ERROR.CODE_1);
		} else if (cantidad < 0) {
			throw new ErrorPersonalizado(CODIGOS_ERROR.CODE_2);
		} else if (cantidad > 100) {
			throw new ErrorPersonalizado(CODIGOS_ERROR.CODE_3);
		}
		this.cantidad = cantidad;
	}

	/**
	 * @return the tallas
	 */
	public Tallas getTallas() {
		return tallas;
	}

	/**
	 * @param tallas the tallas to set
	 */
	public void setTallas(Tallas tallas) {
		this.tallas = tallas;
	}

}

package com.protalento.entidades;

public class GenericaExtendida<E extends Constantes> {// String Integer

	private E elemento;

	public GenericaExtendida() {

	}

	public GenericaExtendida(E elemento) {
		super();
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "GenericaExtendida [elemento=" + elemento + "]";
	}

	/**
	 * @return the elemento
	 */
	public E getElemento() {
		return elemento;
	}

	/**
	 * @param elemento the elemento to set
	 */
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

}

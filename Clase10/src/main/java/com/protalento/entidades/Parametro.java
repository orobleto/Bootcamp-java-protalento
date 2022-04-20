package com.protalento.entidades;

public class Parametro<K, V> {
	private K campo1;
	private V campo2;

	public Parametro() {

	}

	public Parametro(K campo1, V campo2) {
		super();
		this.campo1 = campo1;
		this.campo2 = campo2;
	}

	@Override
	public String toString() {
		return "Parametro [campo1=" + campo1 + ", campo2=" + campo2 + "]";
	}

	/**
	 * @return the campo1
	 */
	public K getCampo1() {
		return campo1;
	}

	/**
	 * @param campo1 the campo1 to set
	 */
	public void setCampo1(K campo1) {
		this.campo1 = campo1;
	}

	/**
	 * @return the campo2
	 */
	public V getCampo2() {
		return campo2;
	}

	/**
	 * @param campo2 the campo2 to set
	 */
	public void setCampo2(V campo2) {
		this.campo2 = campo2;
	}

}

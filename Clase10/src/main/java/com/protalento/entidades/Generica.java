package com.protalento.entidades;

public class Generica<C> {

	private C campo1;
	// private Object campo2;

	public Generica(C campo1) {
		this.campo1 = campo1;
	}

	public C getCampo1() {
		return campo1;
	}

	public void setCampo1(C campo1) {
		this.campo1 = campo1;
	}
	// generico(String, int)

}

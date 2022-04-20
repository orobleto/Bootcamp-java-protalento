package com.protalento.entidades;

public class Pantalon extends Producto{

	private Parametro<Long, String> QR;

	public Pantalon() {

	}

	public Pantalon(Parametro<Long, String> qR) {
		super();
		QR = qR;
	}

	@Override
	public String toString() {
		return "Pantalon [QR=" + QR + "]";
	}

	/**
	 * @return the qR
	 */
	public Parametro<Long, String> getQR() {
		return QR;
	}

	/**
	 * @param qR the qR to set
	 */
	public void setQR(Parametro<Long, String> qR) {
		QR = qR;
	}

}

package com.protalento.Clase09;

public class ExcepcionPersonalizada extends Exception {

	private static final long serialVersionUID = 1L;
	private final String[] ERROR_DESCRIPCION = { "Error en limite de Fecha",
			"Error desconcido, contacte al administrador" };
	private int codigoError;// 0

	public ExcepcionPersonalizada(int codigoError) {
		this.codigoError = codigoError;
	}

	public ExcepcionPersonalizada(String message) {
		super(message);
	}

	@Override
	public String getMessage() {

		switch (codigoError) {
		case 0:
			return super.getMessage();

		default:
			if (codigoError > ERROR_DESCRIPCION.length) {
				return "Error inesperado";
			}
			return ERROR_DESCRIPCION[codigoError - 1];
		}

	}

	/**
	 * @return the codigoError
	 */
	public int getCodigoError() {
		return codigoError;
	}

	/**
	 * @param codigoError the codigoError to set
	 */
	public void setCodigoError(int codigoError) {
		this.codigoError = codigoError;
	}

}

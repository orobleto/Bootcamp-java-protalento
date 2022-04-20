package com.protalento.excepciones;

public class ErrorPersonalizado extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 701975885925108057L;

	public enum CODIGOS_ERROR {
		CODE_1, CODE_2, CODE_3
	}

	private CODIGOS_ERROR error;

	public ErrorPersonalizado(CODIGOS_ERROR error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		switch (error) {// alguno numeros el string char enumerados
		case CODE_1:
			return "Error 1 ....";
		case CODE_2:
			return "Error 2 ....";
		case CODE_3:
			return "Error 3 ....";

		}
		return super.getMessage();
	}

}

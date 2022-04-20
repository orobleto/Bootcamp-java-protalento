package com.protalento.interfaces;

public interface Impresora {

	// metodos abstractos y atributos de clase constantes

	String IMPRESORA_DEFECTO = "EPSON";

	void imprimirFisco();

	void imprimirPDF(String directorio);

	// syso(hola)-- se implemente en todos las clase de Impresora con el mismo
	// algoritmo
	default void imprimirRespaldo() {
		System.out.println("Guardando en c..." + this.getClass());
	}
}

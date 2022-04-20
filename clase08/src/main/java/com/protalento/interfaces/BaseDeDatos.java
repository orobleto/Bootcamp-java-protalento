package com.protalento.interfaces;

public interface BaseDeDatos extends Archivo {

	String MOTOR = "MySQL";
	int TIME_OUT = 30000;

	void guardar();

	boolean eliminar();

}

package com.protalento.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilidadesFecha {
	public static final String FORMATO_FECHA;//
	public static final String FORMATO_FECHA_SQL;

	static {
		FORMATO_FECHA_SQL = "yyyy-MM-dd";
		FORMATO_FECHA = "dd/MM/yyyy";
	}

	/**
	 * Convertir un objeto Date en una cadena
	 * 
	 * @param fecha Date
	 * @return String dd/MM/yyyy
	 */
	public static String getStringDate(Date fecha) {
		SimpleDateFormat formato = new SimpleDateFormat(FORMATO_FECHA);
		return formato.format(fecha);
	}

	/**
	 * Convertir una cadena en un objeto Date
	 * 
	 * @param fecha dd/MM/yyyy
	 * @return Date java.util
	 * @throws ParseException
	 */
	public static Date getDateString(String fecha) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat(FORMATO_FECHA);
		return formato.parse(fecha);
	}

}

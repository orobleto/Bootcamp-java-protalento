package com.protalento.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public interface Fechas {
	public static final String FORMATO_FECHA = "dd/MM/yyyy";
	public static final String FORMATO_FECHA_SQL = "yyyy-MM-dd";

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

	/**
	 * Convertir una cadena en un objeto LocalDate
	 * 
	 * @param fecha dd/MM/yyyy
	 * @return LocalDate java.time
	 */
	public static String getStringLocalDate(LocalDate fecha) {
		return fecha.format(DateTimeFormatter.ofPattern(FORMATO_FECHA));
	}

	/**
	 * Convertir un objeto LocalDate en una cadena
	 * 
	 * @param fecha LocalDate
	 * @return String dd/MM/yyyy
	 */
	public static LocalDate getLocalDateString(String fecha) {
		return LocalDate.parse(fecha, DateTimeFormatter.ofPattern(FORMATO_FECHA));
	}

}

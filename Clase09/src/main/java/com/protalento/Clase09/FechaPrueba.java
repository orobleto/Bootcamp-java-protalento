package com.protalento.Clase09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaPrueba implements AutoCloseable {
	private Date fecha;

	public FechaPrueba() {
		// TODO Auto-generated constructor stub
	}

	public FechaPrueba(Date fecha) {
		super();

		this.fecha = fecha;
	}

	public FechaPrueba(String fecha) throws ParseException {
		super();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		this.fecha = formato.parse(fecha);

	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 * @throws Exception
	 */
	public void setFecha(Date fecha) throws ExcepcionPersonalizada {

		if (fecha.getYear() > 122) {
			throw new ExcepcionPersonalizada(500);
		}
		System.out.println(fecha);
		this.fecha = fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.fecha = formato.parse(fecha);
		} catch (ParseException e) {
			System.out.println("El formato es incorrecto");
			e.printStackTrace();
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Cerrando el recurso de Fecha");

	}
}

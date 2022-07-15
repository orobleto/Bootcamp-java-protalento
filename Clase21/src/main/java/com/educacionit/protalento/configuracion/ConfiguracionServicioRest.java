package com.educacionit.protalento.configuracion;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath(value = "/apis")
public class ConfiguracionServicioRest extends ResourceConfig {

	public ConfiguracionServicioRest() {
		packages("com.educacionit.protalento");
	}

}

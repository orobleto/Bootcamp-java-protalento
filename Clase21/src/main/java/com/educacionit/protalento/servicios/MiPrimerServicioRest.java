package com.educacionit.protalento.servicios;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path(value = "/MiPrimerRest")
public class MiPrimerServicioRest {

	@GET
	@Path("/saludo1")
	public String getSaludo1() {
		return "Hola desde un servicio Rest en Java";
	}

	@GET
	@Path("/saludo2")
	@Produces(value = MediaType.TEXT_HTML)
	public String getSaludo2() {
		return "<h1>Hola desde un servicio Rest en Java</h1>";
	}

	@GET
	@Path("/saludo3")
	@Produces(value = MediaType.TEXT_HTML)
	public Response getSaludo3() {
		return Response.ok().build();
	}

	@GET
	@Path("/saludo4")
	@Produces(value = MediaType.TEXT_HTML)
	public Response getSaludo4() {
		return Response.status(Status.NO_CONTENT).build();
	}

	@GET
	@Path("/saludo5")
	@Produces(value = MediaType.TEXT_HTML)
	public Response getSaludo5() {
		return Response.ok().entity("Saludos todo salio OK").build();
	}
}

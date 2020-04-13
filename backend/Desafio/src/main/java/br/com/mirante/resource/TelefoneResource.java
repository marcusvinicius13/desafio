package br.com.mirante.resource;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.mirante.controller.TelefoneController;
import br.com.mirante.entity.Telefone;

@Path("/phones")
public class TelefoneResource {
	
	@Inject
	private TelefoneController controller;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response index() {
		List<Telefone> telefoneList = new ArrayList<Telefone>();
		
		telefoneList = controller.listar();
		return Response.ok(telefoneList).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response store(Telefone telefone) {
		controller.store(telefone);
		return Response.status(Status.CREATED).build();
	}
	
	@Path("{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") Long id , Telefone telefone) {
		controller.update(id,telefone);
		return Response.status(Status.CREATED).build();
	}
	
	@Path("{id}")
	@DELETE
	public Response destroy(@PathParam("id") Long id) {
		controller.delete(id);
		return Response.status(Status.OK).build();
	}

}

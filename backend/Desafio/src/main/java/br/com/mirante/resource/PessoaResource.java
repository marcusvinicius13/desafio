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

import br.com.mirante.controller.PessoaController;
import br.com.mirante.entity.Pessoa;

@Path("/people")
public class PessoaResource {

	@Inject
	private PessoaController controller;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response index() {
		List<Pessoa> pessoaList = new ArrayList<Pessoa>();
		
		pessoaList = controller.findAll();
		return Response.ok(pessoaList).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response store(Pessoa pessoa) {
		controller.save(pessoa);
		return Response.status(Status.CREATED).build();
	}
	
	@Path("{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") Long id , Pessoa pessoa) {
		controller.update(id,pessoa);
		return Response.status(Status.CREATED).build();
	}
	
	@Path("{id}")
	@DELETE
	public Response destroy(@PathParam("id") Long id) {
		controller.delete(id);
		return Response.status(Status.OK).build();
	}

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.controllers;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.github.joaopaulorosa.cantina.data.Chamado;
import io.github.joaopaulorosa.cantina.data.StatusChamado;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author joao
 */
@Path("chamados")
public class ChamadoController {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<Chamado> listChamados(){
        Chamado c1 = new Chamado();
        c1.setId(1);
        c1.setAssunto("Assunto1");
        c1.setMensagem("Mensagem1");
        c1.setStatus(StatusChamado.NOVO);
        
        Chamado c2 = new Chamado();
        c2.setId(2);
        c2.setAssunto("Assunto2");
        c2.setMensagem("Mensagem2");
        c2.setStatus(StatusChamado.NOVO);
        
        Chamado c3 = new Chamado();
        c3.setId(3);
        c3.setAssunto("Assunto3");
        c3.setMensagem("Mensagem3");
        c3.setStatus(StatusChamado.FECHADO);
        
        List<Chamado> chamados = new ArrayList<>();
        chamados.add(c1);
        chamados.add(c2);
        chamados.add(c3);
        
        return chamados;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/")
    public Chamado getChamado(@PathParam("id") long id){
        Chamado c1 = new Chamado();
        c1.setId(id);
        c1.setAssunto("Assunto"+ id);
        c1.setMensagem("Mensagem"+ id);
        c1.setStatus(StatusChamado.NOVO);
        
        return c1;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response create(Chamado chamado){
        System.out.println(chamado.toString());
        return Response.status(Response.Status.OK).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response update(Chamado chamado){
        System.out.println(chamado.toString());
        return Response.status(Response.Status.OK).build();
    }
    
    @DELETE
    @Path("{id}/")
    public Response delete(@PathParam("id") long id){
        System.out.println("Deletando ID: "+ id);
        return Response.status(Response.Status.OK).build();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.controllers;

import io.github.joaopaulorosa.cantina.business.ChamadoBus;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.github.joaopaulorosa.cantina.data.Chamado;
import io.github.joaopaulorosa.cantina.enumerado.chamado.StatusChamado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
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
        try{
            ChamadoBus chamadoBus = new ChamadoBus();
            return chamadoBus.listar();
        }catch(Exception e){
            Logger.getLogger(ChamadoController.class.getName()).log(Level.SEVERE, null, e);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/")
    public Chamado getChamado(@PathParam("id") long id){
        try{
            ChamadoBus chamadoBus = new ChamadoBus();
            return chamadoBus.selecionar(id);
        }catch(Exception e){
            Logger.getLogger(ChamadoController.class.getName()).log(Level.SEVERE, null, e);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response create(Chamado chamado){
        try{
            ChamadoBus chamadoBus = new ChamadoBus();
            chamadoBus.inserir(chamado);
            return Response.status(Response.Status.OK).build();
        }catch(Exception e){
            Logger.getLogger(ChamadoController.class.getName()).log(Level.SEVERE, null, e);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response update(Chamado chamado){
        try{
            chamado.setStatus(StatusChamado.PENDENTE);
            
            ChamadoBus chamadoBus = new ChamadoBus();
            chamadoBus.alterar(chamado);
            return Response.status(Response.Status.OK).build();
        }catch(Exception e){
            Logger.getLogger(ChamadoController.class.getName()).log(Level.SEVERE, null, e);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    @DELETE
    @Path("{id}/")
    public Response delete(@PathParam("id") long id){
        try{
            ChamadoBus chamadoBus = new ChamadoBus();
            chamadoBus.excluir(id);
            return Response.status(Response.Status.OK).build();
        }catch(Exception e){
            Logger.getLogger(ChamadoController.class.getName()).log(Level.SEVERE, null, e);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}/")
    public Response concluir(@PathParam("id") long id){
        try{
            ChamadoBus chamadoBus = new ChamadoBus();
            
            Chamado c = chamadoBus.selecionar(id);
            c.setStatus(StatusChamado.FECHADO);
            chamadoBus.alterar(c);
            return Response.status(Response.Status.OK).build();
        }catch(Exception e){
            Logger.getLogger(ChamadoController.class.getName()).log(Level.SEVERE, null, e);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    
}

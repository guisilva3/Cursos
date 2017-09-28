/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Curso;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.CursoDAO;
import com.genericrest.service.CursoService;

/**
 *
 * @author Guilherme
 */
@ManagedBean
@Path("/curso")
public class CursoRestService extends GenericCRUDRestService<Curso> implements CursoService{
    
    private static final Logger LOG = LoggerFactory.getLogger(CursoRestService.class);
    
    @Inject
    private CursoDAO cursoDAO;

    public CursoRestService() {
        super(Curso.class);
    }    
    

    @Override
    public GenericEntity listToGenericEntity(List<Curso> list) {
        return new GenericEntity<List<Curso>>(list){};
    }

    @Override
    public DAO getDao() {
        return cursoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    
    @GET
    @Path("/curso/{param}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Override
    public Response findByNome(@PathParam("param") String nome) {
        getLogger().debug("Search Curso object by nome: {}", nome);
        List<Curso> found = cursoDAO.findByNome(nome);
        if (found == null) {
            return Response.noContent().build();
        }
        return Response.ok().entity(found).build();        
    }
    
}

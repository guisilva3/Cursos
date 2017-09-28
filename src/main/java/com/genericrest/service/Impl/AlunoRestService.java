/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.AlunoDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Aluno;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.service.AlunoService;

/**
 *
 * @author Guilherme
 */
@ManagedBean
@Path("/aluno")
public class AlunoRestService extends GenericCRUDRestService<Aluno> implements AlunoService{
          
    private static final Logger LOG = LoggerFactory.getLogger(AlunoRestService.class);
    
    @Inject
    private AlunoDAO alunoDAO;

    public AlunoRestService() {
        super(Aluno.class);
    }         
    
    @Override
    public GenericEntity listToGenericEntity(List<Aluno> list) {
        return new GenericEntity<List<Aluno>>(list){};
    }

    @Override
    public DAO getDao() {
        return alunoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
    
    
}

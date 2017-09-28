/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Coordenador;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.CoordenadorDAO;
import com.genericrest.service.CoordenadorService;

/**
 *
 * @author Guilherme
 */
@ManagedBean
@Path("/coordenador")
public class CoordenadorRestService extends GenericCRUDRestService<Coordenador> implements CoordenadorService{

    public CoordenadorRestService() {
        super(Coordenador.class);
    }
    
    private static final Logger LOG = LoggerFactory.getLogger(CoordenadorRestService.class);  
    
    @Inject
    private CoordenadorDAO coordenadorDAO;

    @Override
    public GenericEntity listToGenericEntity(List<Coordenador> list) {
        return new GenericEntity<List<Coordenador>>(list){};
    }

    @Override
    public DAO getDao() {
        return  coordenadorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}

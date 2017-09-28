/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Instituicao;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.InstituicaoDAO;
import com.genericrest.service.InstituicaoService;

/**
 *
 * @author Guilherme
 */
@ManagedBean
@Path("/instituicao")
public class InstituicaoRestService extends GenericCRUDRestService<Instituicao> implements InstituicaoService{
    
    private static final Logger LOG = LoggerFactory.getLogger(InstituicaoRestService.class);
    
    @Inject
    private InstituicaoDAO instituicaoDAO;

    public InstituicaoRestService() {
        super(Instituicao.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Instituicao> list) {
        return new GenericEntity<List<Instituicao>>(list){};
    }

    @Override
    public DAO getDao() {
        return instituicaoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}

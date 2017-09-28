/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Instituicao;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.InstituicaoDAO;

/**
 *
 * @author Guilherme
 */
@ApplicationScoped
public class InstituicaoDAOImpl extends GenericDAO<Instituicao, Long> implements InstituicaoDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(InstituicaoDAOImpl.class);

    public InstituicaoDAOImpl() {
        super(Instituicao.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;        
    }
    
}

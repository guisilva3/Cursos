/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Coordenador;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.CoordenadorDAO;

/**
 *
 * @author Guilherme
 */
@ApplicationScoped
public class CoordenadorDAOImpl extends GenericDAO<Coordenador, Long> implements CoordenadorDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(CoordenadorDAOImpl.class);

    public CoordenadorDAOImpl() {
        super(Coordenador.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}

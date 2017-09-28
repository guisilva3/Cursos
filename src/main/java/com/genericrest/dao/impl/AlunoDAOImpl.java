/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.AlunoDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Aluno;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Guilherme
 */
@ApplicationScoped
public class AlunoDAOImpl extends GenericDAO<Aluno, Long> implements AlunoDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(AlunoDAOImpl.class);

    public AlunoDAOImpl() {
        super(Aluno.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}

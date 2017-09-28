/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Curso;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.CursoDAO;

@ApplicationScoped
public class CursoDAOImpl extends GenericDAO<Curso, Long> implements CursoDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(CursoDAOImpl.class);    

    public CursoDAOImpl() {
        super(Curso.class);
    }

    @Override
    public List<Curso> findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Curso.findByNome", Curso.class);
        query.setParameter("nome", nome);

        List<Curso> cursos = query.getResultList();
        if (cursos == null || cursos.isEmpty()) {
            return null;
        } else {
            return cursos;
        }       
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}

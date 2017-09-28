/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Area;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.AreaDAO;

/**
 *
 * @author Guilherme
 */
@ApplicationScoped
public class AreaDAOImpl extends GenericDAO<Area, Long> implements AreaDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(AreaDAOImpl.class);

    public AreaDAOImpl() {
        super(Area.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.model.Area;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.AreaDAO;
import com.genericrest.service.AreaService;

/**
 *
 * @author Guilherme
 */
@ManagedBean
@Path("/area")
public class AreaRestService extends GenericCRUDRestService<Area> implements AreaService{
    
    private static final Logger LOG = LoggerFactory.getLogger(AreaRestService.class);
    
    @Inject
    private AreaDAO areaDAO;
    
    public AreaRestService() {
        super(Area.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Area> list) {
        return new GenericEntity<List<Area>>(list){};
    }

    @Override
    public DAO getDao() {
        return areaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.model.Curso;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public interface CursoDAO extends DAO<Curso, Long>{
        
    List<Curso> findByNome(String nome);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@Entity
@Table(name = "aluno")
@XmlRootElement
public class Aluno extends AbstractEntity {
    
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(length = 255, nullable = false)
    private String cpf;
    
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @Temporal(TemporalType.DATE)
    private Date inicioAluno;    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicioAtor;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", inicioAluno=" + inicioAluno + '}';
    }

    public Aluno() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Aluno ator = (Aluno) entity;
        this.cpf = ator.getCpf();
        this.inicioAtor = ator.getInicioAtor();
        this.dataNascimento = ator.getDataNascimento();
        this.nome = ator.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getInicioAtor() {
        return inicioAtor;
    }

    public void setInicioAtor(Date inicioAtor) {
        this.inicioAtor = inicioAtor;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@Entity
@Table(name = "cursos")
@NamedQueries({
    @NamedQuery(name = "Curso.findByNome", query = "select p from Curso p where p.nome = :nome")
})
@XmlRootElement
public class Curso extends AbstractEntity {
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)    
    private Date dataInicial;
    
    @Column(length = 255, nullable = false)
    private String assunto;
    
    @Column(length = 255, nullable = false)
    private String mercado;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Coordenador coordenador;  
    
    @OneToOne(cascade = CascadeType.ALL)
    private Instituicao instituicao;
    
    @OneToMany()
    private List<Aluno> alunos;
    
    @OneToMany
    private List<Area> areas;
    private Date dataInicio;
    private String area;

    public Curso() {
    }    

    @Override
    public void updateParameters(Object entity) {
        final Curso curso = (Curso) entity;
        
        this.dataInicio = curso.getDataInicio();
        this.coordenador = curso.getCoordenador();
        this.area = curso.getArea();
        this.nome = curso.getNome();
        this.mercado = curso.getMercado();
        this.instituicao = curso.getInstituicao();
        this.areas = curso.getAreas();
        this.alunos = curso.getAluno();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
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
        final Curso other = (Curso) obj;
        return Objects.equals(this.nome, other.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", dataInicio=" + dataInicio + ", area=" + area + ", mercado=" + mercado + ", coordenador=" + coordenador + '}';
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    private List<Aluno> getAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

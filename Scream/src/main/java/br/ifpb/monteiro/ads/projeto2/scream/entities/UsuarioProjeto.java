/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.monteiro.ads.projeto2.scream.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name = "usuario_projeto")
public class UsuarioProjeto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    
    @ManyToOne @JoinColumn(name="id_usuario_projeto")
    private UsuarioProjeto usuarioProjeto;
    
    @Column(nullable=false, length=30, name = "horario")
    private Timestamp horario;
    
    @Column(nullable=false, length=30, name = "admin")
    private Boolean admin;

    public Long Id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioProjeto getUsuarioProjeto() {
        return usuarioProjeto;
    }

    public void setUsuarioProjeto(UsuarioProjeto usuarioProjeto) {
        this.usuarioProjeto = usuarioProjeto;
    }

    public Timestamp getHorario() {
        return horario;
    }

    public void setHorario(Timestamp horario) {
        this.horario = horario;
    }

    public Boolean isAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
    
    
}

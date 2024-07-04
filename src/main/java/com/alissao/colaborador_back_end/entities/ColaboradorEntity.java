package com.alissao.colaborador_back_end.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_COLABORADOR")
public class ColaboradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idColaborador")
    private Long id;
    @Column(name = "nomeColaborador",nullable = false)
    private String name;
    @Column(name = "senhaColaborador",nullable = false)
    private String senha;
    @ManyToOne
    @JoinColumn(name = "idSetor")
    SetorEntity setorEntity;

    public SetorEntity getSetorEntity() {
        return setorEntity;
    }

    public void setSetorEntity(SetorEntity setorEntity) {
        this.setorEntity = setorEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

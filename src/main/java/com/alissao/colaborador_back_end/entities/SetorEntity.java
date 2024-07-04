package com.alissao.colaborador_back_end.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_SETOR")
public class SetorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iDSetor")
    private Long id;
    @Column(name = "nomeSetor")
    private String name;

    public SetorEntity() {

    }

    @OneToOne
    ColaboradorEntity colaborador;
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


}

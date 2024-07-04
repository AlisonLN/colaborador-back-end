package com.alissao.colaborador_back_end.service;

import com.alissao.colaborador_back_end.dtos.RegisterColaborador;
import com.alissao.colaborador_back_end.entities.ColaboradorEntity;
import com.alissao.colaborador_back_end.repositories.ColaboradorRepository;
import com.alissao.colaborador_back_end.repositories.SetorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {

    ColaboradorRepository colaboradorRepository;
    SetorRepository setorRepository;

    public ColaboradorService(ColaboradorRepository colaboradorRepository, SetorRepository setorRepository) {
        this.colaboradorRepository = colaboradorRepository;
        this.setorRepository = setorRepository;
    }

    @Transactional
    public ColaboradorEntity saveColaborador(RegisterColaborador registerColaborador) {
    ColaboradorEntity colaborador = new ColaboradorEntity();
    colaborador.setName(registerColaborador.name());
    colaborador.setSenha(registerColaborador.senha());
    colaborador.setSetorEntity(setorRepository.findById(registerColaborador.idSetor()).get());

    return colaboradorRepository.save(colaborador);
    }
}

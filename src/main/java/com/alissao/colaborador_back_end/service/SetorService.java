package com.alissao.colaborador_back_end.service;

import com.alissao.colaborador_back_end.entities.SetorEntity;
import com.alissao.colaborador_back_end.repositories.SetorRepository;
import org.springframework.stereotype.Service;

@Service
public class SetorService {

    private SetorRepository setorRepository;

    public SetorService(SetorRepository setorRepository) {
        this.setorRepository = setorRepository;
    }

    public SetorEntity saveSetor(String name) {
        SetorEntity newSetor = new SetorEntity();
        newSetor.setName(name);
        return setorRepository.save(newSetor);
    }
}

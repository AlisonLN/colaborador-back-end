package com.alissao.colaborador_back_end.repositories;

import com.alissao.colaborador_back_end.entities.ColaboradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository <ColaboradorEntity, Long> {
}

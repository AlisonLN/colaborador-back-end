package com.alissao.colaborador_back_end.controllers;

import com.alissao.colaborador_back_end.dtos.RegisterColaborador;
import com.alissao.colaborador_back_end.entities.ColaboradorEntity;
import com.alissao.colaborador_back_end.service.ColaboradorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colaboradors")
public class ColaboradorController {

    ColaboradorService colaboradorService;

    @Autowired

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @PostMapping
    public ResponseEntity<ColaboradorEntity> saveColaborador (@RequestBody @Valid RegisterColaborador registerColaborador) {
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.saveColaborador(registerColaborador));
    }
}

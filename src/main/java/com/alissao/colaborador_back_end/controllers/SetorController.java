package com.alissao.colaborador_back_end.controllers;

import com.alissao.colaborador_back_end.entities.SetorEntity;
import com.alissao.colaborador_back_end.service.SetorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/setors")
public class SetorController {

    SetorService setorService;
    @Autowired

    public SetorController(SetorService setorService) {
        this.setorService = setorService;
    }


    @PostMapping
    public ResponseEntity<SetorEntity> createSetor (@RequestBody @Valid SetorEntity setorEntity  ){
        try {
            SetorEntity saveSetor = setorService.saveSetor(setorEntity.getName());
            return new ResponseEntity<>(saveSetor, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}


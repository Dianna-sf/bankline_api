package com.dio.santander.bankline.api.Controller;

import com.dio.santander.bankline.api.CorrentistaService;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;

import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }
    @PostMapping
    public void save( @RequestBody NovoCorrentista correntista) {
        service.save(correntista);
    }
}


package com.weg.estacionamento.controller;

import com.weg.estacionamento.model.Leitura;
import com.weg.estacionamento.repository.LeituraRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/leituras")
public class LeituraController {

    private final LeituraRepository repository;

    public LeituraController(LeituraRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Leitura> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Leitura salvar(@RequestBody Leitura leitura) {
        return repository.save(leitura);
    }
}
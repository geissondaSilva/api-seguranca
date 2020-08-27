package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import br.edu.unidep.apiseguranca.apiseguranca.model.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/marca")
public class MarcaController {

    @Autowired
    private MarcaRepository repository;

    @GetMapping
    public List<Marca> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Marca cadastrar(@RequestBody Marca marca) {
        return repository.save(marca);
    }
}

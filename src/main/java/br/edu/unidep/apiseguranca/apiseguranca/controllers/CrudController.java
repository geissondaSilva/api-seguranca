package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public abstract class CrudController<T, I, R extends JpaRepository<T, I>> {

    @Autowired
    private R repository;

    @PostMapping
    public T cadastrar(@Valid @RequestBody T obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public T findById(@Valid @NotNull @PathVariable("id") I id) {
        return repository.findById(id).get();
    }

    @GetMapping
    public List<T> findAll() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") I id) {
        repository.deleteById(id);
    }
}

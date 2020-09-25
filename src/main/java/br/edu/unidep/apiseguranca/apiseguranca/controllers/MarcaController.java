package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import br.edu.unidep.apiseguranca.apiseguranca.model.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.MarcaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/marca")
public class MarcaController extends CrudController<Marca, Long, MarcaRepository> {
}

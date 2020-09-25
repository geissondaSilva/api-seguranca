package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import br.edu.unidep.apiseguranca.apiseguranca.model.Pessoa;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.PessoaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController extends CrudController<Pessoa, Long, PessoaRepository> {
}

package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import br.edu.unidep.apiseguranca.apiseguranca.model.Local;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.LocalRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/local")
public class LocalController extends CrudController<Local, Long, LocalRepository> {
}

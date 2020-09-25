package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import br.edu.unidep.apiseguranca.apiseguranca.model.Imovel;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.ImovelRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/imovel")
public class ImovelController extends CrudController<Imovel, Long, ImovelRepository> {
}

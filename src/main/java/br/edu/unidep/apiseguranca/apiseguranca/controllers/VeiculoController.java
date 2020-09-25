package br.edu.unidep.apiseguranca.apiseguranca.controllers;

import br.edu.unidep.apiseguranca.apiseguranca.model.Veiculo;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.VeiculoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/veiculo")
public class VeiculoController extends CrudController<Veiculo, Long, VeiculoRepository> {
}

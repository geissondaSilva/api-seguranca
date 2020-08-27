package br.edu.unidep.apiseguranca.apiseguranca.enums;

import br.edu.unidep.apiseguranca.apiseguranca.model.Produto;
import br.edu.unidep.apiseguranca.apiseguranca.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public Produto cadastrar(Produto produto) {
        return repository.save(produto);
    }

    @GetMapping
    public List<Produto> lista() {
        return repository.findAll();
    }
}

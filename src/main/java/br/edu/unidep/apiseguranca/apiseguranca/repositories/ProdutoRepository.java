package br.edu.unidep.apiseguranca.apiseguranca.repositories;

import br.edu.unidep.apiseguranca.apiseguranca.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

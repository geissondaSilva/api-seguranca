package br.edu.unidep.apiseguranca.apiseguranca.repositories;

import br.edu.unidep.apiseguranca.apiseguranca.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

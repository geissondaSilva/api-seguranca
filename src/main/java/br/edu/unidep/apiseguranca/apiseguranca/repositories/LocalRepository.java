package br.edu.unidep.apiseguranca.apiseguranca.repositories;

import br.edu.unidep.apiseguranca.apiseguranca.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<Local, Long> {
}

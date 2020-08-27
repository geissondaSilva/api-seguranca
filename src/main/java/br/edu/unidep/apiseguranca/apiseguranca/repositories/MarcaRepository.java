package br.edu.unidep.apiseguranca.apiseguranca.repositories;

import br.edu.unidep.apiseguranca.apiseguranca.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}

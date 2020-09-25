package br.edu.unidep.apiseguranca.apiseguranca.repositories;

import br.edu.unidep.apiseguranca.apiseguranca.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}

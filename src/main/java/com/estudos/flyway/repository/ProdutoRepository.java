package com.estudos.flyway.repository;

import com.estudos.flyway.model.Cliente;
import com.estudos.flyway.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}

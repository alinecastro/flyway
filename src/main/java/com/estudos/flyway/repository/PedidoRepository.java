package com.estudos.flyway.repository;

import com.estudos.flyway.model.Pedido;
import com.estudos.flyway.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}

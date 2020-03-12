package com.estudos.flyway.repository;

import com.estudos.flyway.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente save(Cliente cliente);

    Optional<Cliente> findByCpf(String cpf);

    Optional<Cliente> findByNome(String nome);
}

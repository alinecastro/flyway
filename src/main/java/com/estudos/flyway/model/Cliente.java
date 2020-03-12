package com.estudos.flyway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Cliente {
    @Id
    private Long id;
    private String nome;
    private String cpf;
    private String senha;

}

package edu.unialfa.locadora_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity // JPA - que essa classe é tabela(Entidade) no banco de dados
public class Diretor {

    @Id // JPA - que esse atributo é a PK no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private Long id;

    private String nome;
}

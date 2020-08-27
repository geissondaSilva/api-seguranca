package br.edu.unidep.apiseguranca.apiseguranca.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "marca")
@Getter @Setter
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca")
    @SequenceGenerator(name = "seq_marca", sequenceName = "seq_marca", allocationSize = 1)
    @Column(name = "marcaid")
    private Long id;

    @NotNull(message = "Campo nome não foi preenchido.")
    @Column(name = "nome", length = 50)
    @Size(max = 50, min = 3, message = "Campo nome deve conter no maxímo 50 caracteres e no mínimo 3.")
    private String nome;
}

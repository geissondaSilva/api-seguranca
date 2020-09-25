package br.edu.unidep.apiseguranca.apiseguranca.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@Table(name = "pessoa")
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
    @SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", allocationSize = 1)
    @Column(name = "pessoaid")
    private Long id;

    @NotNull
    @Size(max = 100, min = 3)
    private String nome;

    @Size(max = 20)
    private String cpf;

    @Size(max = 20)
    private String telefone;

    @Size(max = 20)
    private String celular;

    @Size(max = 20)
    private String rg;

    @Temporal(TemporalType.DATE)
    private Date nascimento;

    private Double peso;

    private Double altura;
}

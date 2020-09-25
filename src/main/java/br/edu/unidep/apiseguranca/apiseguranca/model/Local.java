package br.edu.unidep.apiseguranca.apiseguranca.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Table(name = "local")
@Entity
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_local")
    @SequenceGenerator(name = "seq_local", sequenceName = "seq_local", allocationSize = 1)
    @Column(name = "localid")
    private Long id;

    @NotNull
    private String nome;

    private Boolean estacionamento;

    private Boolean banheiro;

    @NotNull
    private String endereco;

    private Double latitude;

    private Double longitude;

    private String complemento;
}

package br.edu.unidep.apiseguranca.apiseguranca.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Table(name = "veiculo")
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_veiculo")
    @SequenceGenerator(name = "seq_veiculo", sequenceName = "seq_veiculo", allocationSize = 1)
    @Column(name = "veiculoid")
    private Long id;

    private String placa;

    @NotNull
    private String modelo;

    private Integer ano;

    private Boolean airbag;

    private Boolean abs;

    private Boolean ar;

    private Boolean gasolina;

    private Boolean etanol;

    private Boolean eletrico;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoaid")
    private Pessoa pessoa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marcaid")
    private Marca marca;
}

package br.edu.unidep.apiseguranca.apiseguranca.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Table
@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_imovel")
    @SequenceGenerator(name = "seq_imovel", sequenceName = "seq_imovel", allocationSize = 1)
    @Column(name = "imovelid")
    private Long id;

    @NotNull
    private String endereco;

    private Integer comodos;

    private Integer quartos;

    private Integer vagas;

    private Integer banheiros;

    private Integer suites;

    @Size(max = 200)
    private String complementos;

    private Double aluguel;

    private Double condominio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "localid")
    private Local local;
}

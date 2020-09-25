package br.edu.unidep.apiseguranca.apiseguranca.model;

import br.edu.unidep.apiseguranca.apiseguranca.enums.UnidadeMedida;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    @SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1)
    @Column(name = "produtoid")
    private Long id;

    @NotNull
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "unidade_medida")
    private UnidadeMedida unidadeMedida;

    @ManyToOne
    @JoinColumn(name = "marcaid")
    private Marca marca;

    @Column(name = "codigo_barra")
    private String codigoBarra;
}

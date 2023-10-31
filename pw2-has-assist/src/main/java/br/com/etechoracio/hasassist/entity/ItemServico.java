package br.com.etechoracio.hasassist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ITEM_SERVICO")
public class ItemServico {

    @Id
    @Column(name = "ID_ITEM_SERVICO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_ORDEM_SERVICO")
    private OrdemServico ordemServico;

    @ManyToOne
    @JoinColumn(name = "ID_SERVICO")
    private Servico servico;

    @Column(name = "NR_VALOR")
    private Double valor;

}

package br.com.etechoracio.hasassist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_SERVICO")
public class Servico {

    @Id
    @Column(name = "ID_SERVICO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DESCRICAO")
    private String descricao;

    @Column(name = "NR_VALOR")
    private Double valor;

}

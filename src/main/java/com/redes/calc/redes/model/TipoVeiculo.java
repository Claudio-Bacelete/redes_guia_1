package com.redes.calc.redes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class TipoVeiculo {
    @Id
    private Long id;
    private String descricao;
    private Float fatorDeMultiplicacao;

}

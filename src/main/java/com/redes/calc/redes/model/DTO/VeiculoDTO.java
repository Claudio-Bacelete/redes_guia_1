package com.redes.calc.redes.model.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO implements Serializable {

    private Integer distEmRodoviaPavimentada;
    private Integer distEmRodoviaNaoPavimentada;
    private Long tipoId;
    private Integer carga;

}

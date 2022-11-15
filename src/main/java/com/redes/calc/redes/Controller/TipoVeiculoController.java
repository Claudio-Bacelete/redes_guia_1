package com.redes.calc.redes.Controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redes.calc.redes.model.TipoVeiculo;
import com.redes.calc.redes.services.TipoVeiculoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tipo")
public class TipoVeiculoController {

    @Autowired
    TipoVeiculoService service;

    @ApiOperation(value = "Listar todos os tipos de Veículo com Fatores de Multiplicação")
    @GetMapping()
    public List<TipoVeiculo> findAllTipoVeiculos() {
        return service.getAllTipoVeiculos();
    }

    @Transactional
    @ApiOperation(value = "Atualizar o fator de multiplicação de um tipo de veículo")
    @PostMapping(value = "/atualizarFator/{id}")
    public TipoVeiculo updateFatorMultiplicacao(@PathVariable(name = "id") Long id,
            @RequestBody Float fatorMultiplicacao) {
        return service.updateFatorMultiplicacao(id, fatorMultiplicacao);
    }

}

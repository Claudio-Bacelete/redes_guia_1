package com.redes.calc.redes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redes.calc.redes.model.TipoVeiculo;
import com.redes.calc.redes.repository.TipoVeiculoRepository;

@Service
public class TipoVeiculoService {
    @Autowired
    TipoVeiculoRepository repository;

    public List<TipoVeiculo> getAllTipoVeiculos() {
        return repository.getAllTipoVeiculos();
    }

    public TipoVeiculo updateFatorMultiplicacao(Long id, Float fatorMultiplicacao) {
        return repository.updateFatorMultiplicacao(id, fatorMultiplicacao);
    }
}

package com.satc.aulaBack.service;

import com.satc.aulaBack.model.Produto;
import com.satc.aulaBack.model.QProduto;
import com.satc.aulaBack.model.Status;
import com.satc.aulaBack.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public Produto salvar(Produto entity) {
        return repository.save(entity);
    }


    public List<Produto> buscaTodos() {
        return repository.findAll();
    }


    public Produto buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }


    public Produto alterar(Produto entity) {
        return repository.save(entity);
    }


    public void remover(Long id) {
        repository.deleteById(id);
    }

}

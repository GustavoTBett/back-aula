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
    private ProdutoRepository produtoRepository;

    public List<Produto> findProdutosAlugados() {
        List<Produto> alugados = produtoRepository.findAll(QProduto.produto.status.eq(Status.ALUGADO));
        return alugados;
    }
}

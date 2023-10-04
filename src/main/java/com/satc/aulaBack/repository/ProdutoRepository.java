package com.satc.aulaBack.repository;

import com.satc.aulaBack.model.Cliente;
import com.satc.aulaBack.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>, CustomQuerydslPredicateExecutor<Produto> {

}

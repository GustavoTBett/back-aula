package com.satc.aulaBack.repository;

import com.satc.aulaBack.model.Cliente;
import com.satc.aulaBack.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>, CustomQuerydslPredicateExecutor<Venda> {
}

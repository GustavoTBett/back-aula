package com.satc.aulaBack.repository;

import com.satc.aulaBack.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, CustomQuerydslPredicateExecutor<Cliente> {
}

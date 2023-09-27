package com.satc.aulaBack.repository;

import com.satc.aulaBack.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

//    @Query("SELECT l FROM Locacao l")
//    List<Locacao> findAll();
}

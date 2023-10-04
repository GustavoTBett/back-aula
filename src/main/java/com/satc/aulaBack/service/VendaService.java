package com.satc.aulaBack.service;

import com.satc.aulaBack.model.Venda;
import com.satc.aulaBack.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;


    public Venda salvarVenda(Venda venda) {


        Venda save = vendaRepository.save(venda);
        return save;
    }


}

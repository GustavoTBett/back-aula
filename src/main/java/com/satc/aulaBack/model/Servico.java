package com.satc.aulaBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Servico extends ItemVendavel{
    @Column(name = "quantidade_horas", nullable = true)
    private Double quantidadeHoras;

    public Servico() {
    }

    public Servico(String descricao, Double quantidadeHoras, Double valor) {
        super.setDescricao(descricao);
        this.quantidadeHoras = quantidadeHoras;
        super.setValorUnitario(valor);
    }

    @Override
    public Boolean getEstocavel() {
        return false;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "quantidadeHoras=" + quantidadeHoras +
                '}';
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}

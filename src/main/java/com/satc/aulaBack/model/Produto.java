package com.satc.aulaBack.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("produto")
public class Produto extends ItemVendavel{
    @Column(name = "nome", length = 100, nullable = true)
    private String nome;
    @Column(name = "preco_compra", nullable = true)
    private Double precoCompra;
    @Column(name = "dt_validade", nullable = true)
    private LocalDate dataValidade;
    @Column(name = "dt_prazo", nullable = true)
    private LocalDate dataPrazo;
    @Enumerated(EnumType.STRING )
    @Column(name = "status")
    private Status status;

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                ", dataValidade=" + dataValidade +
                ", descrição" + super.getDescricao() +
                ", preço" + super.getValorUnitario() +
                ", dataPrazo=" + dataPrazo +
                ", status=" + status +
                '}';
    }

    public Produto(String nome, String descricao) {
        this.nome = nome;
        super.setDescricao(descricao);
    }

    public Produto(String nome, Double precoVenda, Double precoCompra, Status status) {
        this.nome = nome;
        super.setValorUnitario(precoVenda);
        this.precoCompra = precoCompra;
        this.status = status;
    }
    
    public Produto(String nome, String descricao, Double precoVenda, Double precoCompra,
                   LocalDate dataValidade, LocalDate dataPrazo, Status status) {
        this.nome = nome;
        super.setDescricao(descricao);
        super.setValorUnitario(precoVenda);
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.dataPrazo = dataPrazo;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public void setPrecoVenda(Double precoVenda) {
//        if (this.calcularMargemLucro() <= 20.0) {
//            System.out.println("Precisa ser maior ou igual a 20%");
//        } else {
//            super.setValorUnitario(precoVenda);
//        }
//    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }
    
    public Double calcularMargemLucro() {
        Double lucro = super.getValorUnitario() - precoCompra;
        Double margemLucro = (lucro / super.getValorUnitario()) * 100;
        return margemLucro;
    }

    public void setPrecoVenda(Double precoVenda) throws MargemLucroExcepction {
        super.setValorUnitario(precoVenda);
        if (this.calcularMargemLucro() < 20.0) {
            throw new MargemLucroExcepction();
        }
    }
}


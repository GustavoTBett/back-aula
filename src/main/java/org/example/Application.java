package org.example;

import org.example.model.*;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
//        Produto produto = new Produto(1, "Processador", "Ryzen 7 5700x", 110.0,
//                100.0, LocalDate.of(2023, 8, 9), LocalDate.of(2023, 8, 31), Status.ATIVO);
//        Produto produto = new Produto();
//        produto.setNome("Processador");
//        produto.setDescricao("Ryzen 7 5700x");
//        produto.setDataPrazo(LocalDate.of(2023, 8, 9));
//        produto.setDataValidade(LocalDate.of(2023, 8, 31));
//        produto.setPrecoCompra(100.0);
//        produto.setPrecoVenda(110.0);
//        produto.setStatus(Status.ATIVO);
//        System.out.println("Margem " + produto.calcularMargemLucro() + "%");
//
//        Fornecedor dell = new Fornecedor();
//        dell.setNome("Dell");
//        dell.setCnpj("1234567891234");
//        dell.setInscricaoEstadual("456789132");
//        dell.setEmail("dell@email.com");
//        dell.setTelefone("48996230688");
//        dell.setEndereco("rua teste");
        
//        Cliente gustavo = new Cliente();
//        gustavo.setNome("Gustavo");
//        gustavo.setCpf("11119243920");
//        gustavo.setRg("5265005");
//        gustavo.setEmail("gustavo@email.com");
//        gustavo.setTelefone("48996230688");
//        gustavo.setEndereco("rua teste");
//
//        Venda venda01 = new Venda();
//        venda01.setId(10L);
//        venda01.setDataVenda(LocalDate.now());
//        venda01.setCliente(gustavo);
//        venda01.setFormaPagamento(FormaPagamento.APRAZO);
//        venda01.setObservacao("obs 1");
//
//        Produto produto = new Produto("Computador", "i5 8gb");
//        ItemVenda itemVenda = new ItemVenda(produto, 100.00, 1.0, 10.0);
//        venda01.addItemVenda(itemVenda);
//
//        Servico servico = new Servico("instalação", 2.0, 100.00);
//        ItemVenda itemVenda2 = new ItemVenda(servico, 50.00, 1.0, 10.0);
//        venda01.addItemVenda(itemVenda2);

//        System.out.println(venda01.getItens().toString());
//        venda01.getItens().forEach(item -> {
//            System.out.println(item.toString());
//        });

        Produto produtoTeste = new Produto("Computador", "i5");
        System.out.println("Prod " + produtoTeste.getEstocavel());

        Servico servicoTeste = new Servico("instalaçao", 2.0, 100.2);
        System.out.println("Serv " + servicoTeste.getEstocavel());
    }
}

//package org.example;
//
//import org.example.model.*;
//
//import java.time.LocalDate;
//
//public class Application {
//
//    public static void main(String[] args) throws MargemLucroExcepction {
////        createBalaco();
//        Cliente cliente = new Cliente();
//        cliente.setNome("Teste teste");
//
//        try {
//            cliente.getCpf().toUpperCase();
//        } catch (Exception e) {
//            System.out.println("CPF não informado");
//        }
//
//        Integer calculo;
//        try {
//            calculo= 10/0;
//        } catch (ArithmeticException e) {
//            calculo = 0;
//        }
//
//        System.out.println(calculo);
//
//        try {
//            Integer[] array = {10, 14, 22, 33};
//            System.out.println(array[4]);
//        } catch (Exception e) {
//            System.out.println("Posição n existe");
//        }
//
//        Produto produto = new Produto();
//        produto.setPrecoCompra(1200.00);
//        produto.setPrecoVenda(1400.00);
//
//        System.out.println("Sistema finalizado");
//    }
//
//    private static void ateAula3() throws MargemLucroExcepction {
////        Produto produto = new Produto(1, "Processador", "Ryzen 7 5700x", 110.0,
////                100.0, LocalDate.of(2023, 8, 9), LocalDate.of(2023, 8, 31), Status.ATIVO);
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
//
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
//        Venda venda02 = new Venda();
//        venda02.setId(20L);
//        venda02.setDataVenda(LocalDate.now());
//        venda02.setCliente(gustavo);
//        venda02.setFormaPagamento(FormaPagamento.APRAZO);
//        venda02.setObservacao("obs 1");
//
//        Produto produto2 = new Produto("Computador", "i5 8gb");
//        ItemVenda itemVenda = new ItemVenda(produto, 100.00, 1.0, 10.0);
//        venda01.addItemVenda(itemVenda);
//
//        Servico servico = new Servico("instalação", 2.0, 100.00);
//        ItemVenda itemVenda2 = new ItemVenda(servico, 50.00, 1.0, 10.0);
//        venda01.addItemVenda(itemVenda2);
//
//        Produto produtoTeste = new Produto("Computador", "i5");
//        System.out.println("Prod " + produtoTeste.getEstocavel());
//
//        Servico servicoTeste = new Servico("instalaçao", 2.0, 100.2);
//        System.out.println("Serv " + servicoTeste.getEstocavel());
//
//        Locacao locacao = new Locacao();
//        locacao.setDataLocacao(LocalDate.MIN);
//        locacao.setDataDevolucao(LocalDate.now());
//    }
//
//    private static void createBalaco() {
//        Fornecedor fornecedor = new Fornecedor();
//        fornecedor.setNome("Dell Ltda");
//
//        //Declaração de cliente
//        Cliente cliente = new Cliente();
//        cliente.setNome("Bruno Kurzawe");
//
//        //Declaração de Produto
//        Produto produto = new Produto("Computador", "I5 8gb");
//
//        //Declaração de Servico
//        Servico servico = new Servico("Instalação Office", 2.0, 100.00);
//
//        //Declaração de Compras
//        Compra compra = new Compra();
//        compra.setDataCompra(LocalDate.now());
//        compra.setFornecedor(fornecedor);
//        ItemCompra itemC1 = new ItemCompra(produto, 1000.00, 10.0, 10.0);
//        compra.addItemCompra(itemC1);
//
//        //Declaração de Vendas
//        Venda venda = new Venda();
//        venda.setDataVenda(LocalDate.now());
//        venda.setCliente(cliente);
//        ItemVenda item = new ItemVenda(produto, 1500.00, 1.0, 10.0);
//        venda.addItemVenda(item);
//
//        Venda venda2 = new Venda();
//        venda2.setDataVenda(LocalDate.now());
//        venda2.setCliente(cliente);
//        ItemVenda item2 = new ItemVenda(produto, 1500.00, 1.0, 10.0);
//        venda2.addItemVenda(item2);
//        ItemVenda item3 = new ItemVenda(servico, 150.00, 1.0, 10.0);
//        venda2.addItemVenda(item3);
//
//        //Declaração de Lotacao
//        Locacao locacao = new Locacao();
//        locacao.setCliente(cliente);
//        locacao.setDataLocacao(LocalDate.now());
//        ItemLocacao itemL1 = new ItemLocacao(produto, 150.00, 10.0, 0.0);
//        locacao.addItemLocacao(itemL1);
//
//        Balanco balanco = new Balanco();
//        balanco.setId(10l);
//        balanco.setDataBalanco(LocalDate.now());
//        balanco.setResponsavel("Maria");
//        balanco.addOperacoes(venda);
//        balanco.addOperacoes(venda2);
//        balanco.addOperacoes(compra);
//        balanco.addOperacoes(locacao);
//
//        balanco.imprimirBalanco();
//    }
//}

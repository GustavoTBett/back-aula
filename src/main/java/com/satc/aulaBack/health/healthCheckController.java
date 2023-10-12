package com.satc.aulaBack.health;

import com.satc.aulaBack.model.*;
import com.satc.aulaBack.repository.ClienteRepository;
import com.satc.aulaBack.repository.ProdutoRepository;
import com.satc.aulaBack.repository.ServicoRepository;
import com.satc.aulaBack.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class healthCheckController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VendaRepository vendaRepository;

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/teste")
    public String healthCheck2() {
        Produto produto = new Produto();
        produto.setNome("teste");
        produto.setDescricao("teste");
        produto.setDataPrazo(LocalDate.now());
        produto.setPrecoCompra(150.0);
        produto.setPrecoCompra(100.0);
        produto.setEstocavel(Boolean.TRUE);
        produto.setStatus(Status.DISPONIVEL);
        produto.setDataValidade(LocalDate.now());
        produtoRepository.save(produto);

        Servico servico = new Servico();
        servico.setQuantidadeHoras(20.00);
        servico.setDescricao("serviço");
        servico.setEstocavel(true);
        servico.setValorUnitario(150.0);

        servico = servicoRepository.save(servico);

        Cliente cliente = new Cliente();
        cliente.setNome("cliente");
        cliente.setCpf("123");
        cliente.setRg("123");
        cliente.setEndereco("cliente");
        cliente.setEmail("cliente");
        cliente.setTelefone("cliente");

        cliente = clienteRepository.save(cliente);

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setDataVenda(LocalDate.now());
        venda.setObservacao("teste");
        venda.setFormaPagamento(FormaPagamento.CREDITO);

        ItemVenda itemVenda = new ItemVenda(produto, 1000.0, 1.0, 10.00);
        ItemVenda itemVenda2 = new ItemVenda(servico, 100.0, 1.0, 10.00);

        venda.addItemVenda(itemVenda);
        venda.addItemVenda(itemVenda2);

        vendaRepository.save(venda);

        return "Comando executado" + produto.getId();
    }
}

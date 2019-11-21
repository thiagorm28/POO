package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TransacaoTest {

    @Test
    public void deveCriarTransacao() {
        Double saldo = 0.0;
        List<Transacao> extrato = new ArrayList<Transacao>();
        Cliente cliente = new Cliente("Fake", "fake@mail.com", "012.486.790-16", "10.826.758-1");
        Conta conta = new Conta(cliente, saldo, extrato);
        Transacao transacao = new Transacao(conta, "Depósito", 1000.00);
        Assert.assertEquals(transacao.tipo, transacao.getTipo());
        Assert.assertEquals(transacao.valor, transacao.getValor());
    }

    @Test
    public void casoTipoEstejaErrado() {
        Double saldo = 0.0;
        List<Transacao> extrato = new ArrayList<Transacao>();
        Cliente cliente = new Cliente("Fake", "fake@mail.com", "012.486.790-16", "10.826.758-1");
        Conta conta = new Conta(cliente, saldo, extrato);
        try {
            Transacao transacao = new Transacao(conta, "aaa", 1000.00);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Tipo tem que ser: Depósito, Saque ou Transferência", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoValorEstejaErrado() {
        Double saldo = 0.0;
        List<Transacao> extrato = new ArrayList<Transacao>();
        Cliente cliente = new Cliente("Fake", "fake@mail.com", "012.486.790-16", "10.826.758-1");
        Conta conta = new Conta(cliente, saldo, extrato);
        Transacao transacao1 = new Transacao(conta, "Depósito", 1000.00);
        try {
            Transacao transacao = new Transacao(conta, "Depósito", 0.0);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Valor tem que ser maior que zero", naoPodeSerNulo.getMessage());
        }
    }


}
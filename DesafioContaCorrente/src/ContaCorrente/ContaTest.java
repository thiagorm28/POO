package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContaTest {

    @Test
    public void deveCriarConta() {
        List<Transacao> extrato = new ArrayList<Transacao>();
        Transacao transacao1 = new Transacao("Depósito", 1000.00);
        extrato.add(transacao1);
        Cliente cliente = new Cliente("Fake", "fake@mail.com", "012.486.790-16", "10.826.758-1");
        Conta conta = new Conta(cliente, 0.0, extrato);
        Assert.assertEquals(conta.cliente, conta.getCliente());
        Assert.assertEquals(conta.saldo, conta.getSaldo());
        Assert.assertEquals(conta.extrato, conta.getExtrato());
    }

    @Test
    public void verificaSeClienteENulo() {
        Double saldo = 0.0;
        List<Transacao> extrato = new ArrayList<Transacao>();
        Transacao transacao1 = new Transacao("Depósito", 1000.00);
        extrato.add(transacao1);
        try {
            Conta conta = new Conta(null, saldo, extrato);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Cliente não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

}
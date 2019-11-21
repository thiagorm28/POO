package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContaTest {

    @Test
    public void verificaSeClienteENulo() {
        Double saldo = 0.0;
        List<Transacao> extrato = new ArrayList<Transacao>();
        Conta conta = new Conta(null, saldo, extrato);;
        Transacao transacao1 = new Transacao(conta, "Depósito", 1000.00);
        extrato.add(transacao1);
        try {
            conta = new Conta(null, saldo, extrato);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Cliente não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

}
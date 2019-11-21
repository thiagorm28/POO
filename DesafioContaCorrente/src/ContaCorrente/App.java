package ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Double saldo = 0.0;

        List<Transacao> extrato = new ArrayList<Transacao>();

        Cliente cliente = new Cliente("Fake", "fake@mail.com", "012.486.790-16", "10.826.758-1");

        Conta conta = new Conta(cliente, saldo, extrato);

        Transacao transacao1 = new Transacao(conta, "Depósito", 1000.00);

        saldo = Conta.adicionarAoExtratoEAtualizaSaldo(transacao1, extrato, saldo);

        conta = new Conta(cliente, saldo, extrato);

        Transacao transacao2 = new Transacao(conta, "Saque", 500.00);

        saldo = Conta.adicionarAoExtratoEAtualizaSaldo(transacao2, extrato, saldo);

        conta = new Conta(cliente, saldo, extrato);

        System.out.println(conta);

    }

}

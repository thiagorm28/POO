package ContaCorrente;

import java.util.List;

public class Conta {

    public Cliente cliente;
    public Double saldo;
    public List<Transacao> extrato;

    public Conta(Cliente cliente, Double saldo, List<Transacao> extrato){
        if (cliente == null) {
            throw new CampoNaoPodeSerNulo("Cliente não pode ser nulo");
        }
        this.cliente = cliente;
        this.saldo = saldo;
        this.extrato = extrato;
    }

    public Cliente getCliente() {return cliente;}

    public Double getSaldo() {return saldo;}

    public List<Transacao> getExtrato() {return extrato;}

    public static Double adicionarAoExtratoEAtualizaSaldo(Transacao transacao, List<Transacao> extrato, Double saldo){
        extrato.add(transacao);
        Double novoSaldo = saldo;
        if (transacao.tipo.equals("Depósito")){
            novoSaldo += transacao.valor;
        } else {
            novoSaldo -= transacao.valor;
        }
        return novoSaldo;
    }


    @Override
    public String toString(){
        return "Cliente{ " + cliente +
                "} Saldo: " + saldo +
                " Extrato: " + extrato;

    }


}

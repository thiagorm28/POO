package ContaCorrente;

public class Transacao {

    public String tipo;
    public Double valor;

    public Transacao(String tipo, Double valor){
        if (tipo != "Depósito" && tipo != "Saque" && tipo != "Transferência"){
            throw new CampoNaoPodeSerNulo("Tipo tem que ser: Depósito, Saque ou Transferência");
        }
        if (valor <= 0 ){
            throw new CampoNaoPodeSerNulo("Valor tem que ser maior que zero");
        }
        if (tipo != "Depósito" && valor > Conta.saldo) {
            throw new CampoNaoPodeSerNulo("Valor maior do que o saldo da conta");
        }
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {return tipo;}

    public Double getValor() {return valor;}

    @Override
    public String toString(){
        return "Tipo: " + tipo +
                " Valor: " + valor;

    }
}

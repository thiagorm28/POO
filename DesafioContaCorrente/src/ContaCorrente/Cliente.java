package ContaCorrente;

public class Cliente {

    String nome;
    String email;
    String cpf;
    String rg;

    public Cliente(String nome, String email, String cpf, String rg){
        if (nome == null) {
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");
        }
        if (email == null) {
            throw new CampoNaoPodeSerNulo("Email não pode ser nulo");
        }
        if (cpf == null) {
            throw new CampoNaoPodeSerNulo("CPF não pode ser nulo");
        }
        if (rg == null) {
            throw new CampoNaoPodeSerNulo("RG não pode ser nulo");
        }
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {return nome;}

    public String getEmail() {return email;}

    public String getCpf() {return cpf;}

    public String getRg() {return rg;}

    @Override
    public String toString(){
        return "Nome: " + nome +
                " Email: " + email +
                " CPF: " + cpf +
                " RG: " + rg;

    }


}

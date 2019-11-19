package Presenca;

public abstract class Pessoa {

    private String nome;
    private String email;

    public Pessoa(String email, String nome){
        this.email = email;
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return email + " - " + nome;
    }

}

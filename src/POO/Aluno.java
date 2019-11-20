package POO;

public class Aluno extends Pessoa{

    public Double nota;

    public Aluno(String email, String nome){
        super(email, nome);
    }

    @Override
    public String toString(){
        return super.toString() +  "{Aluno{" +
                "nota: " + nota + "\"" + "}}";
    }
}
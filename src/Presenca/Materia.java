package Presenca;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer quantidadeAulas;
    public Professor professor;

    @Override
    public String toString(){
        return "Matéria{" +
                "Nome: " + nome + '\'' +
                "Carga Horaria: " + cargaHoraria +
                "Quantidade de aulas: " + quantidadeAulas +
                ", Professor: " + professor;
    }

}
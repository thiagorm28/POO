package Presenca;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer quantidadeAulas;
    public Professor professor;


    public Materia(String nome, String descricao, Double cargaHoraria, Integer quantidadeAulas, Professor professor){
        if (nome == null){
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");
        }
        if (descricao == null){
            throw new CampoNaoPodeSerNulo("Descrição não pode ser nulo");
        }
        if (cargaHoraria == null){
            throw new CampoNaoPodeSerNulo("Carga Horária não pode ser nulo");
        }
        if (professor == null){
            throw new CampoNaoPodeSerNulo("Professor não pode ser nulo");
        }
        this.nome =  nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeAulas = quantidadeAulas;
        this.professor = professor;
    }

    public void trocaProfessor(Professor professorNovo){
        if (professorNovo == null){
            throw new CampoNaoPodeSerNulo("Professor não pode ser nulo");
        }
        professor = professorNovo;
    }

    public String getNome(){return nome;}

    public String getDescricao(){return descricao;}

    public Double getCargaHoraria(){return cargaHoraria;}

    public Integer getQuantidadeAulas(){return quantidadeAulas;}

    public Professor getProfessor(){return professor;}

    @Override
    public String toString(){
        return "Matéria{" +
                "Nome: " + nome + '\'' +
                "Carga Horaria: " + cargaHoraria +
                "Quantidade de aulas: " + quantidadeAulas +
                ", Professor: " + professor;
    }

}
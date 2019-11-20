package Presenca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    public Date data;
    public Materia materia;
    public List<Aluno> alunos = new ArrayList<Aluno>();



    public void darPresenca(Aluno aluno){
        if (aluno == null){
            throw new CampoNaoPodeSerNulo("Alunos não pode ser nulo");
        }
        this.alunos.add(aluno);
    }

    public Aula(Date data, Materia materia, List<Aluno> alunos){
        if (data == null){
            throw new CampoNaoPodeSerNulo("Data não pode ser nula");
        }
        if (materia == null){
            throw new CampoNaoPodeSerNulo("Matéria não pode ser nulo");
        }
        if (alunos == null){
            throw new CampoNaoPodeSerNulo("Lista de alunos não pode ser nulo");
        }
        this.data = data;
        this.materia = materia;
        this.alunos = alunos;
    }


    public Date getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }



    @Override
    public String toString(){
        return "Aula{" +
                "Data: " + data +
                ", Matéria: " + materia +
                ", Lista de Alunos: " + alunos;
    }
}

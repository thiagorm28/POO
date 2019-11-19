package Presenca;

import java.util.Date;
import java.util.List;

public class Aula {
    public Date data;
    public Materia materia;
    public List<Aluno> alunos;

    @Override
    public String toString(){
        return "Aula{" +
                "Data: " + data +
                ", Matéria: " + materia +
                ", Lista de Alunos: " + alunos;
    }
}

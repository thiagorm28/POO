package Presenca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("maiko.cunha@db1.com.br", "Maiko Cunha");

        Aluno aluno2 = new Aluno("joao.silva@db1.com.br", "João Silva");

        Professor professor = new Professor("igor.silva@db1.com.br", "Igor Silva");

        Materia materia = new Materia("POO", "Abstração, Encapsulamento, Polimorfismo e Herança", 10.5, 3, professor);

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.addAll(Arrays.asList(aluno1, aluno2));

        Aula aula = new Aula(new Date(), materia, alunos);

        System.out.println(aula);

        Professor professor1 = new Professor("thiago@email.com", "Thiago");

       materia.trocaProfessor(professor1);

        System.out.println(aula);
    }
}

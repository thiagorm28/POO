package Presenca;

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("maiko.cunha@db1.com.br", "Maiko Cunha");

        Aluno aluno2 = new Aluno("joao.silva@db1.com.br", "João Silva");

        Professor professor = new Professor("igor.silva@db1.com.br", "Igor Silva");

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, Encapsulamento, Polimorfismo e Herança";
        materia.cargaHoraria = 10.5;
        materia.quantidadeAulas = 3;
        materia.professor = professor;

        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.alunos = new ArrayList<>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);

        System.out.println(aula);
    }
}

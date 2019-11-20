package Presenca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AulaTest {

    @Test
    public void deveCriarAulaPeloConstrutor(){
        Date data = new Date();
        Aluno aluno1 = new Aluno("Thiago Rodrigues Moraes", "thiagorm28@outlook.com");
        Aluno aluno2 = new Aluno("AAAAAAAAAAA", "aaaaa@hotmail.com");
        Materia materiaExpected = new Materia("POO", "Pilares da POO", 10.5,
                3, new Professor("igor.silva@db1.com.br", "Igor Silva"));
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.addAll(Arrays.asList(aluno1, aluno2));
        Aula aula = new Aula(data, materiaExpected, alunos);
        Assertions.assertEquals(data, aula.getData());
        Assertions.assertEquals(materiaExpected, aula.getMateria());
        Assertions.assertEquals(alunos, aula.getAlunos());
    }


    @Test
    public void casoDataSejaNulo(){
        Materia materia = new Materia("POO", "Pilares da POO", 10.5,
                3, new Professor("igor.silva@db1.com.br", "Igor Silva"));
        Aluno aluno1 = new Aluno("Thiago Rodrigues Moraes", "thiagorm28@outlook.com");
        Aluno aluno2 = new Aluno("AAAAAAAAAAA", "aaaaa@hotmail.com");
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.addAll(Arrays.asList(aluno1, aluno2));
        try {
            Aula aula = new Aula(null, materia, alunos);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Data não pode ser nula", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoMateriaSejaNulo(){
        Date data = new Date();
        Aluno aluno1 = new Aluno("Thiago Rodrigues Moraes", "thiagorm28@outlook.com");
        Aluno aluno2 = new Aluno("AAAAAAAAAAA", "aaaaa@hotmail.com");
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.addAll(Arrays.asList(aluno1, aluno2));
        try {
            Aula aula = new Aula(data, null, alunos);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Matéria não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoListaDeAlunosSejaNulo(){
        Date data = new Date();
        Materia materia = new Materia("POO", "Pilares da POO", 10.5,
                3, new Professor("igor.silva@db1.com.br", "Igor Silva"));
        try {
            Aula aula = new Aula(data, materia, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Lista de alunos não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    /*@Test
    public void deveAdicionarAlunoNaChamada(){
        Date data = new Date();
        String email = "email.fake@email.com";
        String nome = "Fake";
        Aluno aluno = new Aluno(email, nome);
        Professor professor = new Professor("fabio@db1.com.br", "Fábio");
        Materia materia = new Materia("POO", "Pilares da POO", 10.5,
                3, professor);
        Aula aula = new Aula(data, materia);
    }*/
}

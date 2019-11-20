package Presenca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MateriaTest {

    Professor professorExpected = new Professor("igor.silva@db1.com.br", "Igor Silva");

    @Test
    public void deveCriarMateria(){
        Professor professorExpected = new Professor("igor.silva@db1.com.br", "Igor Silva");
        Materia materia = new Materia("POO", "Pilares da POO", 10.5, 3, professorExpected);
        String nomeExpected = "POO";
        String descricaoExpected = "Pilares da POO";
        Double cargaHorariaExpected = 10.5;
        Integer quantidadeAulasExpected = 3;
        Assertions.assertEquals(nomeExpected, materia.getNome());
        Assertions.assertEquals(descricaoExpected, materia.getDescricao());
        Assertions.assertEquals(cargaHorariaExpected, materia.getCargaHoraria());
        Assertions.assertEquals(quantidadeAulasExpected, materia.getQuantidadeAulas());
        Assertions.assertEquals(professorExpected, materia.getProfessor());
    }

    @Test
    public void casoNomeSejaNulo(){
        try {
            Materia materia = new Materia(null, "Pilares da POO", 10.5, 3,
                    professorExpected);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoDescricaoSejaNulo(){
        try {
            Materia materia = new Materia("POO", null, 10.5, 3,
                    professorExpected);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Descrição não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoCargaHorariaSejaNulo(){
        try {
            Materia materia = new Materia("POO", "Pilares da POO", null, 3,
                    professorExpected);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Carga Horária não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoQuantidadeDeAulasSejaNulo(){
        try {
            Materia materia = new Materia("POO", "Pilares da POO", 10.5, null,
                    professorExpected);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Quantidade de aulas não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoProfessorSejaNulo(){
        try {
            Materia materia = new Materia("POO", "Pilares da POO", 10.5, 3,
                    null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Professor não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoTrocaProfessorSejaNulo(){
        Materia materia = new Materia("POO", "Pilares da POO", 10.5, 3,
                professorExpected);
        try {
            materia.trocaProfessor(null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Professor não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
}
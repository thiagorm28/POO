package Presença;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MateriaTest {
    Professor professorResponse= new Professor("igor.silva@db1.com.br", "Igor Silva");
    @Test
    public void deveCriarMateria(){
        Materia materia = new Materia("POO", "Pilares da POO", 10.5, 3, professorResponse);
        String nomeExpected = "POO";
        String descricaoExpected = "Pilares da POO";
        Double cargaHorariaExpected = 10.5;
        Integer quantidadeAulasExpected = 3;
        Professor professorExpected = professorResponse;
        Assertions.assertEquals(nomeExpected, materia.getNome());
        Assertions.assertEquals(descricaoExpected, materia.getDescricao());
        Assertions.assertEquals(cargaHorariaExpected, materia.getCargaHoraria());
        Assertions.assertEquals(quantidadeAulasExpected, materia.getQuantidadeAulas());
        Assertions.assertEquals(professorExpected, materia.getProfessor());
    }

}
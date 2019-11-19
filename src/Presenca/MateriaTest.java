package Presenca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MateriaTest {
    @Test
    public void deveCriarMateria(){
        Materia materia = new Materia("POO", "Pilares de POO", 10.5, 3, "Igor Silva");
        String nomeExpected = "Fake Fake";
        String emailExpected = "fake.email@email.com";
        Assertions.assertEquals(nomeExpected, materia.nome());
        Assertions.assertEquals(emailExpected, materia.getEmail());
    }

}
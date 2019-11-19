package Presenca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfessorTest {

    @Test
    public void deveCriarProfessorPeloConstrutor(){
        Professor professor = new Professor("fake.email@email.com", "Fake Fake");
        String nomeExpected = "Fake Fake";
        String emailExpected = "fake.email@email.com";
        Assertions.assertEquals(nomeExpected, professor.getNome());
        Assertions.assertEquals(emailExpected, professor.getEmail());
    }

}
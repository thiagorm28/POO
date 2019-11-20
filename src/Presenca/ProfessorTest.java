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

    @Test
    public void casoNomeSejaNulo(){
        try {
            Professor professor = new Professor("professor@hotmail.com", null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoEmailSejaNulo(){
        try {
            Professor professor = new Professor(null, "Professor");
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

}
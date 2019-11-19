package Presenca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    public void deveCriarAlunoPeloConstrutor(){
        Aluno Aluno = new Aluno("fake.email@email.com", "Fake Fake");
        String nomeExpected = "Fake Fake";
        String emailExpected = "fake.email@email.com";
        Assertions.assertEquals(nomeExpected, Aluno.getNome());
        Assertions.assertEquals(emailExpected, Aluno.getEmail());
    }

}
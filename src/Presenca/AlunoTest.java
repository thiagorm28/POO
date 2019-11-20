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

    @Test
    public void casoNomeSejaNulo(){
        String email = "fake.email@email.com";
        try {
            Aluno aluno = new Aluno (email, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assertions.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void casoEmailSejaNulo(){
       String nome = "Fake";
       try {
           Aluno aluno = new Aluno(null, nome);
       } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
           Assertions.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
       }


    }

}
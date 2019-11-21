package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void deveCriarCliente() {
        Cliente cliente = new Cliente("Fake", "fake@email.com", "012.486.790-16", "10.826.758-1");
        Assert.assertEquals(cliente.nome, cliente.getNome());
        Assert.assertEquals(cliente.email, cliente.getEmail());
        Assert.assertEquals(cliente.cpf, cliente.getCpf());
        Assert.assertEquals(cliente.rg, cliente.getRg());
    }

    @Test
    public void verificaSeNomeENulo() {
        try {
            Cliente cliente = new Cliente(null, "fake@email.com", "012.486.790-16", "10.826.758-1");
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void verificaSeEmailENulo() {
        try {
            Cliente cliente = new Cliente("Fake", null, "012.486.790-16", "10.826.758-1");
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void verificaSeCpfENulo() {
        try {
            Cliente cliente = new Cliente("Fake", "fake@email.com", null, "10.826.758-1");
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("CPF não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void verificaSeRgENulo() {
        try {
            Cliente cliente = new Cliente("Fake", "fake@email.com", "012.486.790-16", null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("RG não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

}
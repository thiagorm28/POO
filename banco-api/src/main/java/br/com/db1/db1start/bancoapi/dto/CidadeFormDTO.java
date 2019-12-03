package br.com.db1.db1start.bancoapi.dto;

public class CidadeFormDTO {

    private String nome;

    private Long estadoId;

    public Long getEstadoId() {
        return estadoId;
    }

    public void setId(Long id) {
        this.estadoId = estadoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package br.com.db1.db1start.bancoapi.dto;

public class EstadoDTO {

    private Long id;

    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
}

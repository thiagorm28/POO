package br.com.db1.db1start.bancoapi.adapter;

import br.com.db1.db1start.bancoapi.dto.CidadeDTO;
import br.com.db1.db1start.bancoapi.entity.Cidade;

public class CidadeAdapter {

    public static CidadeDTO mudaCidadeParaDTO(Cidade cidade) {
        CidadeDTO dto = new CidadeDTO();
        dto.setId(cidade.getId());
        dto.setNome(cidade.getNome());
        dto.setNomeEstado(cidade.getEstado().getNome());
        return dto;
    }
}

package br.com.db1.db1start.bancoapi.adapter;

import br.com.db1.db1start.bancoapi.dto.AgenciaDTO;
import br.com.db1.db1start.bancoapi.entity.Agencia;

public class AgenciaAdapter {

    public static AgenciaDTO mudaAgenciaParaDTO(Agencia agencia) {
        AgenciaDTO dto = new AgenciaDTO();
        dto.setId(agencia.getId());
        dto.setNumero(agencia.getNumero());
        dto.setNomeCidade(agencia.getCidade().getNome());
        return dto;
    }
}

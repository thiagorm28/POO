package br.com.db1.db1start.bancoapi.controller;

import br.com.db1.db1start.bancoapi.adapter.AgenciaAdapter;
import br.com.db1.db1start.bancoapi.dto.AgenciaDTO;
import br.com.db1.db1start.bancoapi.dto.AgenciaFormDTO;
import br.com.db1.db1start.bancoapi.entity.Agencia;
import br.com.db1.db1start.bancoapi.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AgenciaController {

    @Autowired
    AgenciaService agenciaService;

    @GetMapping("/agencias/{cidadeId}")
    public List<AgenciaDTO> buscarTodasAgencias(@PathVariable Long cidadeId) {
        List<Agencia> agencias = agenciaService.buscarTodasPeloIdDaCidade(cidadeId);
        List<AgenciaDTO> listaDeRetorno = new ArrayList<>();
        agencias.forEach(agencia -> {
            AgenciaDTO agenciaDTO = AgenciaAdapter.mudaAgenciaParaDTO(agencia);
            listaDeRetorno.add(agenciaDTO);
        });
        return listaDeRetorno;
    }

    @PostMapping("/agencia")
    public void cadastraAgencia(AgenciaFormDTO form) {
        agenciaService.criar(form.getNumero(), form.getNumeroBanco(), form.getCidadeId());
    }

    @DeleteMapping("/agencia/{agenciaId}")
    public void atualizaAgencia(@PathVariable Long agenciaId) {
        agenciaService.deletaPorId(agenciaId);
    }
}

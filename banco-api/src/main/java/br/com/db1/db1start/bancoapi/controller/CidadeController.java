package br.com.db1.db1start.bancoapi.controller;

import br.com.db1.db1start.bancoapi.adapter.CidadeAdapter;
import br.com.db1.db1start.bancoapi.dto.CidadeDTO;
import br.com.db1.db1start.bancoapi.dto.CidadeFormDTO;
import br.com.db1.db1start.bancoapi.entity.Cidade;
import br.com.db1.db1start.bancoapi.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CidadeController {

    @Autowired
    CidadeService cidadeService;

    @GetMapping("/cidades")
    public List<CidadeDTO> buscarTodasCidades() {
        List<Cidade> cidades = cidadeService.buscarTodos();
        List<CidadeDTO> listaDeRetorno = new ArrayList<>();
        cidades.forEach(cidade -> {
            CidadeDTO cidadeDTO = CidadeAdapter.mudaCidadeParaDTO(cidade);
            listaDeRetorno.add(cidadeDTO);
        });
        return listaDeRetorno;
    }

    @PostMapping("/cidade")
    public void cadastrarNovaCidade(@RequestBody CidadeFormDTO formDTO) {
        cidadeService.criar(formDTO.getNome(), formDTO.getEstadoId());
    }

    @PutMapping("/cidade/{cidadeId}")
    public void alteraCidade(@PathVariable Long cidadeId, @RequestBody CidadeFormDTO form) {
        cidadeService.atualizar(cidadeId, form.getNome());
    }

    @DeleteMapping("/cidade/{cidadeId}")
    public void deletaCidade(@PathVariable Long cidadeId) {
        cidadeService.deletarPorId(cidadeId);
    }
}

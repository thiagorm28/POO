package br.com.db1.db1start.bancoapi.controller;

import br.com.db1.db1start.bancoapi.adapter.EstadoAdapter;
import br.com.db1.db1start.bancoapi.dto.EstadoDTO;
import br.com.db1.db1start.bancoapi.dto.EstadoFormDTO;
import br.com.db1.db1start.bancoapi.entity.Estado;
import br.com.db1.db1start.bancoapi.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estados")
    public List<EstadoDTO> buscasTodosEstados() {
        List<Estado> estados = estadoService.buscarTodos();
        List<EstadoDTO> listaDeRetorno = new ArrayList<>();
        estados.forEach(estado -> {
            EstadoDTO meuEstadoDto = EstadoAdapter.transformaEntidadeParaDTO(estado);
            listaDeRetorno.add(meuEstadoDto);
        });
        return listaDeRetorno;
    }

    @PostMapping("/estado")
    public void cadastrarNovoEstado(@RequestBody EstadoFormDTO formDTO) {
        estadoService.criar(formDTO.getNome());
    }
}

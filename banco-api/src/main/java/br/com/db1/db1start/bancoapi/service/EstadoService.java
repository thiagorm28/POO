package br.com.db1.db1start.bancoapi.service;

import java.util.List;

import br.com.db1.db1start.bancoapi.dto.EstadoFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1start.bancoapi.entity.Estado;
import br.com.db1.db1start.bancoapi.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public Estado criar(String nome) {
        Estado estado = new Estado();
        estado.setNome(nome);
        return estadoRepository.save(estado);
    }

    public Estado atualizar(Long estadoId, EstadoFormDTO novoNome) {
        Estado estado = buscarPorId(estadoId);
        estado.setNome(novoNome.getNome());
        return estadoRepository.save(estado);
    }

    public Estado buscarPorId(Long id) {
        return estadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Estado não encontrado"));
    }

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public void deletarPorId(Long id) {
        estadoRepository.deleteById(id);
    }
    
    public void deletarTodos() {
    	estadoRepository.deleteAll();
    }
}

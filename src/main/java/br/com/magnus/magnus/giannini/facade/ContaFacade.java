package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.ContaRepository;
import br.com.magnus.magnus.giannini.entity.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContaFacade {
    private static final Map<Long, Conta> contas = new HashMap<>();

    @Autowired
    private ContaRepository contaRepository;

    public Conta criar(Conta conta) {
        return contaRepository.save(conta);
    }

    public Conta atualizar(Conta conta) {
        return contaRepository.save(conta);
    }

    public Optional<Conta> recuperarPorId(Long contaId) {
        return contaRepository.findById(contaId);
    }

    public List<Conta> getAll() {
        List<Conta> lista = contaRepository.findAll();
        return lista;
    }

    public String delete(Long contaId) {
        contaRepository.deleteById(contaId);
        return "DELETADO";
    }
}

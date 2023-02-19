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

    public ResponseEntity<String> criar(Conta conta) {
        contaRepository.save(conta);
        return new ResponseEntity<String>("Conta criado com sucesso", HttpStatus.OK);
    }

    public Conta atualizar(Conta conta, Long contaId) {
        contaRepository.save(conta);
        return conta;
    }

    public Optional<Conta> recuperarPorId(Long contaId) {
        return contaRepository.findById(contaId);
    }

    public List<Conta> getAll() {
        List<Conta> lista = contaRepository.findAll();
        return lista;
    }

    public ResponseEntity<String> delete(Conta conta) {
        contaRepository.delete(conta);
        return new ResponseEntity<String>("Conta deletada com sucesso", HttpStatus.OK);
    }
}

package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.ContaRepository;
import br.com.magnus.magnus.giannini.entity.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContaFacade {
    private static final Map<Long, Conta> contas = new HashMap<>();

    @Autowired
    private ContaRepository contaRepository;

    public Conta criar(Conta conta) {
        contaRepository.save(conta);
        return conta;
    }

    public Conta atualizar(Conta conta, Long contaId) {
        contaRepository.save(conta);
        return conta;
    }

    public Conta recuperarPorId(Long contaId) {
        return contas.get(contaId);
    }

    public List<Conta> getAll() {
         List<Conta> lista = contaRepository.findAll();
        return lista;
    }

    public String delete(Long contaId) {
        contas.remove(contaId);
        return "DELETADO";
    }
}

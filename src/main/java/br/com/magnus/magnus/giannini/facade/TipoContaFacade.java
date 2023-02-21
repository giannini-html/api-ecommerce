package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.TipoContaRepository;
import br.com.magnus.magnus.giannini.entity.Conta;
import br.com.magnus.magnus.giannini.entity.TipoConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TipoContaFacade {
    @Autowired
    private TipoContaRepository tipoContaRepository;

    public TipoConta criar(TipoConta tipoConta) {
        return tipoContaRepository.save(tipoConta);
    }

    public TipoConta atualizar(TipoConta tipoConta) {
        return tipoContaRepository.save(tipoConta);
    }

    public Optional<TipoConta> recuperarPorId(Long tipoConta) {
        return tipoContaRepository.findById(tipoConta);
    }

    public List<TipoConta> getAll() {
        List<TipoConta> lista = tipoContaRepository.findAll();
        return lista;
    }

    public String delete(Long tipoContaId) {
        tipoContaRepository.deleteById(tipoContaId);
        return "DELETADO";
    }
}

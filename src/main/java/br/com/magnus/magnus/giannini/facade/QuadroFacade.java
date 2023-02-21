package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.QuadroRepository;
import br.com.magnus.magnus.giannini.entity.Quadro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuadroFacade {
    @Autowired
    private QuadroRepository quadroRepository;

    public Quadro criar(Quadro quadro) {
        return quadroRepository.save(quadro);
    }

    public Quadro atualizar(Quadro quadro) {
        return quadroRepository.saveAndFlush(quadro);
    }

    public Optional<Quadro> recuperarPorId(Long quadroId) {
        return quadroRepository.findById(quadroId);
    }

    public List<Quadro> getAll() {
        return new ArrayList<>(quadroRepository.findAll());
    }

    public String delete(Long quadroId) {
        quadroRepository.deleteById(quadroId);
        return "DELETADO";
    }
}

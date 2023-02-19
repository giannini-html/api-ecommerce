package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.entity.Quadro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuadroFacade {
    private static final Map<Long, Quadro> quadros = new HashMap<>();

    public Quadro criar(Quadro quadro) {
        Long proximoId = (long) (quadros.keySet().size() + 1);
        quadro.setCod_quadro(proximoId);
        quadros.put(proximoId, quadro);
        return quadro;
    }

    public Quadro atualizar(Quadro quadro, Long quadroId) {
        quadros.put(quadroId, quadro);
        return quadro;
    }

    public Quadro recuperarPorId(Long quadroId) {
        return quadros.get(quadroId);
    }

    public List<Quadro> getAll() {
        return new ArrayList<>(quadros.values());
    }

    public String delete(Long quadroId) {
        quadros.remove(quadroId);
        return "DELETADO";
    }
}

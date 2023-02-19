package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.entity.Carrinho;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarrinhoFacade {
    private static final Map<Long, Carrinho> carrinho = new HashMap<>();

    public Carrinho criar(Carrinho carrinho) {
        Long proximoId = (long) (CarrinhoFacade.carrinho.keySet().size() + 1);
        carrinho.setCod_carrinho(proximoId);
        CarrinhoFacade.carrinho.put(proximoId, carrinho);
        return carrinho;
    }

    public Carrinho atualizar(Carrinho carrinho, Long carrinhoId) {
        CarrinhoFacade.carrinho.put(carrinhoId, carrinho);
        return carrinho;
    }

    public Carrinho recuperarPorId(Long carrinhoId) {
        return carrinho.get(carrinhoId);
    }

    public List<Carrinho> getAll() {
        return new ArrayList<>(carrinho.values());
    }

    public String delete(Long carrinhoId) {
        carrinho.remove(carrinhoId);
        return "DELETADO";
    }
}

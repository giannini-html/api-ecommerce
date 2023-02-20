package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.CarrinhoRepository;
import br.com.magnus.magnus.giannini.entity.Carrinho;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarrinhoFacade {
    private static final Map<Long, Carrinho> carrinho = new HashMap<>();

    private CarrinhoRepository carrinhoRepository;

    public Carrinho criar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public Carrinho atualizar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public Carrinho recuperarPorId(Long carrinhoId) {
        return carrinhoRepository.getById(carrinhoId);
    }

    public List<Carrinho> getAll() {
        return new ArrayList<>(carrinhoRepository.findAll());
    }

    public String delete(Long carrinhoId) {
        carrinhoRepository.deleteById(carrinhoId);
        return "DELETADO";
    }
}

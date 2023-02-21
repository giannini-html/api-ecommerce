package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.CarrinhoRepository;
import br.com.magnus.magnus.giannini.entity.Carrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CarrinhoFacade {
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho criar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public Carrinho atualizar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public Optional<Carrinho> recuperarPorId(Long carrinhoId) {
        return carrinhoRepository.findById(carrinhoId);
    }

    public List<Carrinho> getAll() {
        return new ArrayList<>(carrinhoRepository.findAll());
    }

    public String delete(Long carrinhoId) {
        carrinhoRepository.deleteById(carrinhoId);
        return "DELETADO";
    }
}

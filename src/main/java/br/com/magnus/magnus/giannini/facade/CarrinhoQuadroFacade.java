package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.CarrinhoQuadroRepository;
import br.com.magnus.magnus.giannini.dao.CarrinhoRepository;
import br.com.magnus.magnus.giannini.entity.Carrinho;
import br.com.magnus.magnus.giannini.entity.CarrinhoQuadro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoQuadroFacade {
    @Autowired
    private CarrinhoQuadroRepository CarrinhoQuadroRepository;

    public CarrinhoQuadro criar(CarrinhoQuadro carrinhoQuadro) {
        return CarrinhoQuadroRepository.save(carrinhoQuadro);
    }

    public CarrinhoQuadro atualizar(CarrinhoQuadro carrinhoQuadro) {
        return CarrinhoQuadroRepository.save(carrinhoQuadro);
    }

    public Optional<CarrinhoQuadro> recuperarPorId(Long carrinhoQuadroId) {
        return CarrinhoQuadroRepository.findById(carrinhoQuadroId);
    }

    public List<CarrinhoQuadro> getAll() {
        return new ArrayList<>(CarrinhoQuadroRepository.findAll());
    }

    public String delete(Long carrinhoQuadroId) {
        CarrinhoQuadroRepository.deleteById(carrinhoQuadroId);
        return "DELETADO";
    }
}

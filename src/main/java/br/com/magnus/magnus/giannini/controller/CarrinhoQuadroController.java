package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Carrinho;
import br.com.magnus.magnus.giannini.entity.CarrinhoQuadro;
import br.com.magnus.magnus.giannini.facade.CarrinhoFacade;
import br.com.magnus.magnus.giannini.facade.CarrinhoQuadroFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pedido", produces = MediaType.APPLICATION_JSON_VALUE)
public class CarrinhoQuadroController {

    @Autowired
    private CarrinhoQuadroFacade carrinhoQuadroFacade;

    @PostMapping
    public CarrinhoQuadro criar(@RequestBody CarrinhoQuadro carrinhoQuadro) {
        return carrinhoQuadroFacade.criar(carrinhoQuadro);
    }

    @PutMapping
    public CarrinhoQuadro atualizar(@RequestBody CarrinhoQuadro carrinhoQuadro) {
        return carrinhoQuadroFacade.atualizar(carrinhoQuadro);
    }

    @GetMapping
    public List<CarrinhoQuadro> getAll() {
        return carrinhoQuadroFacade.getAll();
    }

    @GetMapping("/{carrinhoQuadroId}")
    public Optional<CarrinhoQuadro> obterPorId(@PathVariable Long carrinhoQuadroId) {
        return carrinhoQuadroFacade.recuperarPorId(carrinhoQuadroId);
    }

    @DeleteMapping("/{carrinhoQuadroId}")
    public String atualizar(@PathVariable Long carrinhoQuadroId) {
        return carrinhoQuadroFacade.delete(carrinhoQuadroId);
    }
}

package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Carrinho;
import br.com.magnus.magnus.giannini.facade.CarrinhoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carrinho", produces = MediaType.APPLICATION_JSON_VALUE)
public class CarrinhoController {

    @Autowired
    private CarrinhoFacade carrinhoFacade;

    @PostMapping
    public Carrinho criar(@RequestBody Carrinho carrinho) {
        return carrinhoFacade.criar(carrinho);
    }

    @PutMapping
    public Carrinho atualizar(@RequestBody Carrinho carrinho) {
        return carrinhoFacade.atualizar(carrinho);
    }

    @GetMapping
    public List<Carrinho> getAll() {
        return carrinhoFacade.getAll();
    }

    @GetMapping("/{carrinhoId}")
    public Carrinho obterPorId(@PathVariable Long carrinhoId) {
        return carrinhoFacade.recuperarPorId(carrinhoId);
    }

    @DeleteMapping("/{carrinhoId}")
    public String atualizar(@PathVariable Long carrinhoId) {
        return carrinhoFacade.delete(carrinhoId);
    }
}

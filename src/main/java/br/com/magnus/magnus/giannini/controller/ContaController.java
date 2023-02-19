package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Conta;
import br.com.magnus.magnus.giannini.facade.ContaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/conta", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContaController {

    @Autowired
    private ContaFacade contaFacade;

    @PostMapping
    public Conta criar(@RequestBody Conta conta) {
        return contaFacade.criar(conta);
    }

    @PutMapping("/{contaId}")
    public Conta atualizar(@PathVariable Long contaId, @RequestBody Conta conta) {
        return contaFacade.atualizar(conta, contaId);
    }

    @GetMapping
    public List<Conta> getAll() {
        return contaFacade.getAll();
    }

    @GetMapping("/{contaId}")
    public Conta obterPorId(@PathVariable Long contaId) {
        return contaFacade.recuperarPorId(contaId);
    }

    @DeleteMapping("/{contaId}")
    public String atualizar(@PathVariable Long contaId) {
        return contaFacade.delete(contaId);
    }
}

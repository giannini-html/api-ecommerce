package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Conta;
import br.com.magnus.magnus.giannini.facade.ContaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/conta", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContaController {

    @Autowired
    private ContaFacade contaFacade;

    @PostMapping
    public Conta criar(@RequestBody Conta conta) {
        return contaFacade.criar(conta);
    }

    @PutMapping
    public Conta atualizar(@RequestBody Conta conta) {
        return contaFacade.atualizar(conta);
    }

    @GetMapping
    public List<Conta> getAll() {
        return contaFacade.getAll();
    }

    @GetMapping("/{contaId}")
    public Optional<Conta> obterPorId(@PathVariable Long contaId) {
        return contaFacade.recuperarPorId(contaId);
    }

    @DeleteMapping("/{contaId}")
    public String deletar(@RequestBody Long contaId) {
        return contaFacade.delete(contaId);
    }
}

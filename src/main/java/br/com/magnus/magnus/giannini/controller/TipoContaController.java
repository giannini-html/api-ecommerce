package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Conta;
import br.com.magnus.magnus.giannini.entity.TipoConta;
import br.com.magnus.magnus.giannini.facade.ContaFacade;
import br.com.magnus.magnus.giannini.facade.TipoContaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tipoconta", produces = MediaType.APPLICATION_JSON_VALUE)
public class TipoContaController {

    @Autowired
    private TipoContaFacade tipoContaFacade;

    @PostMapping
    public TipoConta criar(@RequestBody TipoConta tipoConta) {
        return tipoContaFacade.criar(tipoConta);
    }

    @PutMapping
    public TipoConta atualizar(@RequestBody TipoConta conta) {
        return tipoContaFacade.atualizar(conta);
    }

    @GetMapping
    public List<TipoConta> getAll() {
        return tipoContaFacade.getAll();
    }

    @GetMapping("/{tipoContaId}")
    public Optional<TipoConta> obterPorId(@PathVariable Long contaId) {
        return tipoContaFacade.recuperarPorId(contaId);
    }

    @DeleteMapping("/{tipoContaId}")
    public String deletar(@RequestBody Long contaId) {
        return tipoContaFacade.delete(contaId);
    }
}

package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Quadro;
import br.com.magnus.magnus.giannini.facade.QuadroFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/quadro", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuadroController {

    @Autowired
    private QuadroFacade quadroFacade;

    @PostMapping
    public Quadro criar(@RequestBody Quadro quadro) {
        return quadroFacade.criar(quadro);
    }

    @PutMapping("/{quadroId}")
    public Quadro atualizar(@PathVariable Long quadroId, @RequestBody Quadro quadro) {
        return quadroFacade.atualizar(quadro, quadroId);
    }

    @GetMapping
    public List<Quadro> getAll() {
        return quadroFacade.getAll();
    }

    @GetMapping("/{quadroId}")
    public Quadro obterPorId(@PathVariable Long quadroId) {
        return quadroFacade.recuperarPorId(quadroId);
    }

    @DeleteMapping("/{quadroId}")
    public String atualizar(@PathVariable Long quadroId) {
        return quadroFacade.delete(quadroId);
    }
}

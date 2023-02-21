package br.com.magnus.magnus.giannini.controller;

import br.com.magnus.magnus.giannini.entity.Usuario;
import br.com.magnus.magnus.giannini.facade.UsuarioFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

    @Autowired
    private UsuarioFacade usuarioFacade;

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioFacade.criar(usuario);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) {
        return usuarioFacade.atualizar(usuario);
    }

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioFacade.getAll();
    }

    @GetMapping("/{usuarioId}")
    public Optional<Usuario> obterPorId(@PathVariable Long usuarioId) {
        return usuarioFacade.recuperarPorId(usuarioId);
    }

    @DeleteMapping("/{usuarioId}")
    public String atualizar(@PathVariable Long usuarioId) {
        return usuarioFacade.delete(usuarioId);
    }
}

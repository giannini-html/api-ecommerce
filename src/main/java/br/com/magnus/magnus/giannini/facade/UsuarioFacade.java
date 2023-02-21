package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.UsuarioRepository;
import br.com.magnus.magnus.giannini.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UsuarioFacade {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }

    public Optional<Usuario> recuperarPorId(Long clienteId) {
        return usuarioRepository.findById(clienteId);
    }

    public List<Usuario> getAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    public String delete(Long clienteId) {
        usuarioRepository.deleteById(clienteId);
        return "DELETADO";
    }
}

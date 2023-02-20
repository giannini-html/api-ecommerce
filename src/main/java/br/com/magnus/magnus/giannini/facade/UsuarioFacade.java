package br.com.magnus.magnus.giannini.facade;

import br.com.magnus.magnus.giannini.dao.UsuarioRepository;
import br.com.magnus.magnus.giannini.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioFacade {
    private static final Map<Long, Usuario> clientes = new HashMap<>();

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Usuario usuario, Long clienteId) {
        clientes.put(clienteId, usuario);
        return usuario;
    }

    public Usuario recuperarPorId(Long clienteId) {
        return clientes.get(clienteId);
    }

    public List<Usuario> getAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    public String delete(Long clienteId) {
        clientes.remove(clienteId);
        return "DELETADO";
    }
}

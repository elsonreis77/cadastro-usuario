package com.elsonreis.cadastro_usuario.business;

import com.elsonreis.cadastro_usuario.infrastructure.entitys.Usuario;
import com.elsonreis.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email) {
        repository.deliteByEmail(email);
    }

    public void atualizarUsuarioPorEmail(Integer id, Usuario usuario) {

    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
    }
}

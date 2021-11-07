package com.confirmarcadastro.microservico.service;

import com.confirmarcadastro.microservico.Repository.UsuarioRepository;
import com.confirmarcadastro.microservico.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService  {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public List<Usuario> getUsuarios() {
        return this.usuarioRepository.findAll();
    }
}

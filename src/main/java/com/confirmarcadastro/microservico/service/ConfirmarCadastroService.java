package com.confirmarcadastro.microservico.service;

import com.confirmarcadastro.microservico.Repository.ConfirmarCadastroRepository;
import com.confirmarcadastro.microservico.Repository.UsuarioRepository;
import com.confirmarcadastro.microservico.domain.Confirmacao;
import com.confirmarcadastro.microservico.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ConfirmarCadastroService {

    @Autowired
    ConfirmarCadastroRepository confirmarCadastroRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario){
        Usuario usuarioRep = this.usuarioRepository.findByEmail(usuario.getEmail());

        return this.confirmarCadastroRepository.confirmarCadastro(usuarioRep);
    }
}

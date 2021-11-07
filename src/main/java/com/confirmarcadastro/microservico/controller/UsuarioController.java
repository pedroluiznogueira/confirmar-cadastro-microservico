package com.confirmarcadastro.microservico.controller;

import com.confirmarcadastro.microservico.domain.Usuario;
import com.confirmarcadastro.microservico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/cadastro")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("create")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.createUsuario(usuario);
    }

}

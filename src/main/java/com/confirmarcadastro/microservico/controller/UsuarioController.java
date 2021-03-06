package com.confirmarcadastro.microservico.controller;

import com.confirmarcadastro.microservico.domain.Usuario;
import com.confirmarcadastro.microservico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("create")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.createUsuario(usuario);
    }

    @GetMapping("usuarios")
    public List<Usuario> getUsuarios(){
        return this.usuarioService.getUsuarios();
    }

}

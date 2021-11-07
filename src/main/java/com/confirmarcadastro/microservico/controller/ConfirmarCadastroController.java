package com.confirmarcadastro.microservico.controller;

import com.confirmarcadastro.microservico.domain.Confirmacao;
import com.confirmarcadastro.microservico.domain.Usuario;
import com.confirmarcadastro.microservico.service.ConfirmarCadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/confirmar-cadastro")
public class ConfirmarCadastroController {

    @Autowired
    private ConfirmarCadastroService cs;

    @PostMapping("confirmar")
    public Usuario confirmarCadastro(@RequestBody Usuario usuario) {
        return cs.createUsuario(usuario);
    }


}

package com.confirmarcadastro.microservico.Repository;

import com.confirmarcadastro.microservico.domain.Confirmacao;
import com.confirmarcadastro.microservico.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url= "https://udeyou-api.herokuapp.com" , name = "confirmar")
public interface ConfirmarCadastroRepository {

    @PostMapping("cadastro")
    Usuario confirmarCadastro(@RequestBody Usuario usuario);
}

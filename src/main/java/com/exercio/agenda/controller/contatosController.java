package com.exercio.agenda.controller;

import com.exercio.agenda.model.contatosModel;
import com.exercio.agenda.service.contatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;
import java.util.Optional;

@RestController
public class contatosController {

    @Autowired
    private contatosService service;

    @GetMapping(path = "/agenda")
    public List<contatosModel> buscarContatos(){
        return service.buscarTodosContatos ();
    }
    @GetMapping(path = "/agenda/{codigo}")
    public Optional <contatosModel> buscarContatoPorId(@PathVariable Long codigoDoContao){
        return service.buscarPorId (codigoDoContao);
    }
    @PostMapping(path = "/agenda")
    public contatosModel cadastrarContato(@RequestBody contatosModel contato){
        return service.cadastrar (contato);
    }
    @PutMapping(path = "/agenda/{codigoDoContato}")
    public contatosModel alterarcontato(@RequestBody contatosModel contato){
        return service.alterarContato (contato);
    }
    @DeleteMapping(path = "/agenda/{codigoDoContato}")
    public void deletarcontato(@PathVariable Long codigoDoContato){
        service.deletar (codigoDoContato);

    }

}

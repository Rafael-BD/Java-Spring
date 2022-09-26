package com.fatec.rafaebd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.rafaebd.entity.Usuario;
import com.fatec.rafaebd.services.segurancaService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {
    
    @Autowired
    private segurancaService SegurancaService;

    @GetMapping
    public List<Usuario> buscarTodos(){
        return SegurancaService.todosUsuarios();
    }
    @GetMapping(value = "/{id}")
    public Usuario buscarPorID(@PathVariable("id") long id){
        return SegurancaService.buscarPorId(id);
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario){
        return SegurancaService.novoUsuario(usuario);
    }
}

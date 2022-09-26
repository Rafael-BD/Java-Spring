package com.fatec.rafaebd.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fatec.rafaebd.entity.Usuario;

public interface segurancaService extends UserDetailsService {
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public Usuario novoUsuario(String nome, String senha, String autorizacao);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPorId(Long id);

}

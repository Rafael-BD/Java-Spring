package com.fatec.rafaebd.services;

import java.util.List;

import com.fatec.rafaebd.entity.Usuario;

public interface segurancaService {
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPorId(Long Id);
}

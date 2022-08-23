package com.fatec.rafaebd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.rafaebd.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}

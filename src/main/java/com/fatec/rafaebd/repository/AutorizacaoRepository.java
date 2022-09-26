package com.fatec.rafaebd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.rafaebd.entity.Autorizacao;


public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {
    
    public Autorizacao findByNome(String nome);

}

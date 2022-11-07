package com.fatec.rafaebd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fatec.rafaebd.entity.sensor;

public interface SensorRepository extends JpaRepository<sensor, Long> {
  
    @Query("select us from sensor us where sen_medicao < ?1")
    public List<sensor> buscarPorValorMenor(float valor);
      
  }

package com.fatec.rafaebd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.rafaebd.entity.sensor;
import com.fatec.rafaebd.repository.SensorRepository;

@Service
public class sensorServiceImpl implements sensorService {

    @Autowired
    private SensorRepository sensorRepo;

    @Override
    public List<sensor> buscarPorValor(float valor) {
        List<sensor> sensorOptional = sensorRepo.buscarPorValorMenor(valor);
            return sensorOptional;
    }

    
}
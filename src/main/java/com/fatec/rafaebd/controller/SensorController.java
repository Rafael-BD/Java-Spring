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
import com.fatec.rafaebd.entity.sensor;
import com.fatec.rafaebd.services.segurancaService;
import com.fatec.rafaebd.services.sensorService;

@RestController
@RequestMapping(value = "/sensor")
@CrossOrigin
public class SensorController {
    
     @Autowired
     private sensorService SensorService;

    @GetMapping(value = "/{valor}")
    public List<sensor> buscarPorValor(@PathVariable("valor") float valor){
        return SensorService.buscarPorValor(valor);
    }

}

package com.fatec.rafaebd.services;
import java.util.List;

import com.fatec.rafaebd.entity.sensor;

public interface sensorService {

    public List<sensor> buscarPorValor(float valor);

}
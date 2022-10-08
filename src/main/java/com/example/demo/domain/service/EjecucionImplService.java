package com.example.demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.access.dao.Ejecucion_dao;
import com.example.demo.domain.entity.Ejecucion;

@Service
public class EjecucionImplService implements IUEjecucionService {

    @Autowired
    private Ejecucion_dao ejecucion_dao;

    @Override
    public Iterable<Ejecucion> obtenerEjecucion() {
        return ejecucion_dao.findAll();
    }

    @Override
    public Ejecucion ejecucionxNum_orden(Long num_orden) {
        Ejecucion objejecucion = ejecucion_dao.findById(num_orden).orElse(null);
        if (objejecucion == null) {
            return new Ejecucion(0L, 0, null, null, null, null, null, null);
        }
        return objejecucion;
    }

    @Override
    public Ejecucion crearejecucion(Ejecucion ejecucion) {
        return ejecucion_dao.save(ejecucion);
    }

    @Override
    public Ejecucion actualizarejecucion(Ejecucion ejecucion) {
        Ejecucion updateejcu = ejecucion_dao.findById(ejecucion.getNum_orden()).orElse(null);
        if (updateejcu == null) {
            return new Ejecucion(0L, 0, null, null, null, null, null, null);
        }
        return ejecucion_dao.save(ejecucion);
    }

    @Override
    public Boolean eliminarejecucion(Long Num_orden) {
        try {
            ejecucion_dao.deleteById(Num_orden);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
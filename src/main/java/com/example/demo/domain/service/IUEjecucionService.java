package com.example.demo.domain.service;

import com.example.demo.domain.entity.Ejecucion;

public interface IUEjecucionService {

    public Iterable<Ejecucion> obtenerEjecucion();

    public Ejecucion ejecucionxNum_orden(Long Num_orden);

    public Ejecucion crearejecucion(Ejecucion ejecucion);

    public Ejecucion actualizarejecucion(Ejecucion ejecucion);

    public Boolean eliminarejecucion(Long Num_orden);

    /* findByUserPassword(String user, String password); */

    /* public Ejecucion_dao findById(Long id); */
}

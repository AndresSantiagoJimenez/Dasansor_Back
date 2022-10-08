package com.example.demo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.entity.Ejecucion;
import com.example.demo.domain.service.IUEjecucionService;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/ejecucion")
public class Ejecucion_controller {
    // Atributos
    @Autowired
    IUEjecucionService service;

    /** ACCIONES */
    @GetMapping
    public Iterable<Ejecucion> obtenerEjecucion() {
        return service.obtenerEjecucion();
    }

    @GetMapping("/{Num_orden}")
    public Ejecucion ejecucionxNum_orden(@PathVariable(name = "Num_orden") Long Num_orden) {
        return service.ejecucionxNum_orden(Num_orden);
    }

    @PostMapping
    public Ejecucion crearejecucion(@RequestBody Ejecucion ejecucion) {
        return service.crearejecucion(ejecucion);
    }

    @PutMapping
    @CrossOrigin("*")
    public Ejecucion actualizarejecucion(@RequestBody Ejecucion ejecucion) {
        return service.actualizarejecucion(ejecucion);
    }

    @DeleteMapping("/{Num_orden}")
    public Boolean eliminarejecucion(@PathVariable(name = "Num_orden") Long Num_orden) {
        return service.eliminarejecucion(Num_orden);
    }
}

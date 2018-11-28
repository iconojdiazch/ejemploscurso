/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.concesionario;

/**
 *
 * @author iconotc
 */
public class Concesionario {

    private Vehiculo[] vehiculos;

    public Concesionario() {
        cargarBd();
    }

    private void cargarBd() {
        vehiculos = new Vehiculo[]{
            new Coche(true, "abc", 2000.0),
            new Moto(true, "def", 1000.0),};
    }

    public void generarInforme() {
        System.out.println("Número de vehículos: " + vehiculos.length);
        for (Vehiculo v : vehiculos) {
            System.out.println(v.imprimir());
        }
    }

}

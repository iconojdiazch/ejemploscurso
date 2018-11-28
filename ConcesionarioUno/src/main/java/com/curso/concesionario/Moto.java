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
public class Moto extends Vehiculo {

    private boolean sidecar;

    public String imprimir() {
        return super.imprimir() + "Sidecar: " + sidecar;
    }

    public Moto() {
    }

    public Moto(boolean sidecar, String matricula, double precio) {
        super(matricula, precio);
        this.sidecar = sidecar;
    }
}

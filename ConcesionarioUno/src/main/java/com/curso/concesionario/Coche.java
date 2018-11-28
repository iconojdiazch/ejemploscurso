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
public class Coche extends Vehiculo {

    private boolean airbag;

    public String imprimir() {
        return super.imprimir() + "Airbag: " + airbag;
    }

    public Coche() {
    }

    public Coche(boolean airbag, String matricula, double precio) {
        super(matricula, precio);
        this.airbag = airbag;
    }
}

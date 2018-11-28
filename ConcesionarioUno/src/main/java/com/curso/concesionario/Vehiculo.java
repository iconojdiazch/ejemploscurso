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
public class Vehiculo {

    private String matricula;

    private double precio;

    public String imprimir() {
        return "Matrícula: " + matricula + ".Precio: " + precio + ".";
    }

    public Vehiculo() {
    }

    public Vehiculo(String matricula, double precio) {
        this.matricula = matricula;
        this.precio = precio;
    }

}

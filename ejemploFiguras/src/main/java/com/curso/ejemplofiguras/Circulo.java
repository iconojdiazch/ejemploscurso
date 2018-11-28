/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejemplofiguras;

/**
 *
 * @author iconotc
 */
public class Circulo implements Figura{

    public Circulo() {
        log();
    }

    @Override
    public void dibujar() {
        System.out.println("En dibujar de Círculo");
    }
    
}

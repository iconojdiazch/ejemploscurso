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
public interface Figura {
    void dibujar();
    default void log(){
        System.out.println("Método default");        
    }
    static void logStatic(){
        System.out.println("Método static");
    }
}

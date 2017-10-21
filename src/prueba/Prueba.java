/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import prueba.aritmetica.NumA;

/**
 *
 * @author SenaFontibon
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumA numerito = new NumA();
        System.out.println("sumando " + numerito.sumar(5, 5,5));
        System.out.println("multiplique :) " + numerito.multiplicar(5, 5));
    }

}

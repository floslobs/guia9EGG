/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.ParDeNumeros;

/**
 *
 * @author ARG
 */
public class ParDeNumerosService {
    public void mostrarValores(ParDeNumeros par) {
        System.out.println("numero 1: " + par.getNum1());
        System.out.println("numero 2: " + par.getNum2());
        
    }
    
    public double devolverMayor(ParDeNumeros par){
        return Math.max(par.getNum1(), par.getNum2());
    }
    
    public double calcularPotencia(ParDeNumeros par){
        double mayor = devolverMayor(par);
        double menor = (mayor == par.getNum1())? par.getNum2() : par.getNum1();
        return Math.pow(Math.round(mayor), Math.round(menor));
    }
    
     public double calcularRaiz(ParDeNumeros par) {
        double menor = Math.min(par.getNum1(), par.getNum2());
        return Math.sqrt(Math.abs(menor));
        
     }
}

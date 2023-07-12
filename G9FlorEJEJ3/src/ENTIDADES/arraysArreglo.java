/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import Servicios.ArregloServis;

/**
 *
 * @author ARG
 */
public class arraysArreglo {

    /**
     * @param args the command line arguments
     */
    /*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B 
    de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
*/
    public static void main(String[] args) {
        // TODO code application logic here
        ArregloServis rreglo = new ArregloServis();
        double vecA[] = new double[50];
        double vecB[] = new double[20];
        
        rreglo.inicializarA(vecA);
        rreglo.mostrarA(vecA);
        rreglo.mostrarAMayorMenor(vecA);
        rreglo.inicializarB(vecA, vecB);
        rreglo.mostrarA(vecA);
        rreglo.mostrarA(vecB);
    }
    
}

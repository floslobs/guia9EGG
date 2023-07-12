/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import Servicios.CadenaServicios;

/**
 *
 * @author ARG
 */
public class G9FlorEJEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         CadenaServicios cad = new CadenaServicios();

        Cadena cadena1 = new Cadena("Casa blanca");

        cad.mostrarVocales(cadena1);

        cad.invertirFrase(cadena1);

    }
    
}

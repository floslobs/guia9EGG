/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author ARG
 */
public class claseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           FechaService fechaService = new FechaService();

        // Obtener la fecha de nacimiento del usuario
        Date fechaDeNacimiento = fechaService.fechaDeNacimiento();

        // Obtener la fecha actual
        Date fechaActual = fechaService.fechaActual();

        // Calcular la diferencia de años (edad del usuario)
        int edad = fechaService.diferencia(fechaDeNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    }
    
}

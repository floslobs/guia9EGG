/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
/*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor 
vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
*/
public class FechaService {
    
    public Date fechaDeNacimiento(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println(" ingrese dia de nacimiento ");
        int dia = sc.nextInt();
        System.out.println(" ingrese mes de nacimiento ");
        int mes = sc.nextInt()-1;
        System.out.println(" ingrese el año de nacimiento");
        int anio = sc.nextInt() - 1900;
        
        return new Date(anio,mes,dia);
        
        
        
    }
    public Date fechaActual(){
        return new Date();
    }
    
     public int diferencia(Date fechaNacimiento, Date fechaActual) {
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
     }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.arraysArreglo;
import java.util.Arrays;

/**
 *
 * @author ARG
 */
/*Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/
public class ArregloServis {
    public void inicializarA(double[]  A){
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() *50;
        }
        System.out.println("--------------------------");
    }
    public void mostrarA(double[] A) {
        System.out.println(Arrays.toString(A));
        System.out.println("---------------------------");
        
    }
    public void mostrarAMayorMenor(double[] A) {
        Arrays.sort(A);
        mostrarA(A);
        
    }
     public void inicializarB(double[] A, double[] B) {
        System.arraycopy(A, 0, B, 0, B.length / 2);
        Arrays.fill(B, B.length / 2, B.length, 0.5);
     }
}

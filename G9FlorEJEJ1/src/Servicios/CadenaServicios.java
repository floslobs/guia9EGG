/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.Cadena;

/**
 *
 * @author ARG
 */
/*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el
usuario y contabilizar cuántas veces se repite el carácter en la frase, por
ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase
Cadena con una nueva frase ingresada por el usuario y mostrar la frase 
resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que 
se encuentren en la frase, por algún otro carácter seleccionado por el usuario
y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class CadenaServicios {

    public void mostrarVocales(Cadena frase) {
        int cont = 0;
        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            switch (frase.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    cont++;

        }
        }
        System.out.println("La cantidad de vocales son: " + cont);
    }

    public void invertirFrase(Cadena frase) {
        String a = "";
        for (int i = frase.getLongitudFrase(); i > 0; i--) {

            a += frase.getFrase().substring(frase.getLongitudFrase(), frase.getLongitudFrase() - i);

        }

        System.out.println(a + frase.getFrase().substring(0, 1));
    }

}
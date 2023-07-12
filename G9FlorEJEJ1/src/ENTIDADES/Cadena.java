/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

/**
 *
 * @author ARG
 */

/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como
atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo
frase solamente. Agregar getters y setters. El constructor con frase como atributo debe
setear la longitud de la frase de manera automática. Crear una clase CadenaServicio en el 
paquete servicios que implemente los siguientes métodos:
*/
public class Cadena {
    
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitudFrase=" + longitudFrase + '}';
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import ENTIDAD.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class CursoServicio {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Ingresa el nombre del curso");
        curso.setNombreCurso(sc.next());
        System.out.println("Ingres la cantidad de horas por día de cursado");
        curso.setHorasPorDia(sc.nextInt());
        System.out.println("Ingresa la cantidad de días que se va a dictar el cursado");
        curso.setDiasPorSemana(sc.nextInt());
        System.out.println("Ingrese si es turno mañana o tarde");
        curso.setTurno(sc.next());
        System.out.println("Ingresa el valor de la hora del cursado");
        curso.setPrecioPorHora(sc.nextInt());
        
        curso.setAlumnos(cargarAlumnos(curso.getAlumnos().length));
        return curso;
    }

    private String[] cargarAlumnos(int longitudVector) {
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = sc.next();
        }
        return alumnos;
    }

    public void mostrarAlumnos(Curso curso) {
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }

    public void calcularGananciaSemanal(Curso curso) {
        System.out.println("La ganancia semanal es de " + (curso.getDiasPorSemana() * curso.getHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));
    }
    
}

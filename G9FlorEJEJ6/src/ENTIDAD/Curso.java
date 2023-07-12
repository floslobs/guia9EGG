/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

/**
 *
 * @author ARG
 */
public class Curso {
    private String nombreCurso;
    private int horasPorDia;
    private int DiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
        
    }

    public Curso(String nombreCurso, int horasPorDia, int DiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.horasPorDia = horasPorDia;
        this.DiasPorSemana = DiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(int horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    public int getDiasPorSemana() {
        return DiasPorSemana;
    }

    public void setDiasPorSemana(int DiasPorSemana) {
        this.DiasPorSemana = DiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    }

  
 
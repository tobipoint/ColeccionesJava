/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Alumno {

    public String nombre;
    public List <Double> notas = new  ArrayList();
    public double promedioFinal;
    
    public Alumno() {
    }

    public Alumno(String nombre, double promedioFinal) {
        this.nombre = nombre;
        this.promedioFinal = promedioFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre = " + nombre + ", notas = " + notas + ", promedioFinal = " + promedioFinal + '}';
    }

}

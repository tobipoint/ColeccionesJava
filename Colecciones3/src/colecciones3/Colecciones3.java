/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

import Entidades.Alumno;
import Servicio.AlumnoServicio;

/**
 *
 * @author Usuario
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();
        Alumno a1 = new Alumno();
        as.AñadirAlumnos();
        System.out.println("-----ALUMNOS-------");
        as.MostrarAlumnos();
        System.out.println("------------");
        as.BuscarAlumno();
        
    }

}

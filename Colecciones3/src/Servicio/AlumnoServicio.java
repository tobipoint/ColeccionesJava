/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> lista = new ArrayList();

    public ArrayList<Alumno> AñadirAlumnos() {
        int op;

        do {
            System.out.println("desea ingresar un alumno?");
            System.out.println("(1)Si // (2) No");
            op = leer.nextInt();
            if (op == 1) {
                lista.add(CrearAlumnos());
            }
        } while (op != 2);

        return lista;
    }

    public Alumno CrearAlumnos() {
        Alumno a1 = new Alumno();

        System.out.println("ingrese su nombre");
        a1.setNombre(leer.next());

        System.out.println("ingrese sus 3 notas ");
        a1.getNotas().add((leer.nextDouble()));
        a1.getNotas().add((leer.nextDouble()));
        a1.getNotas().add((leer.nextDouble()));
        SacarPromedio(a1);
        return a1;

    }

    public void SacarPromedio(Alumno a1) {
        double finales = 0;

        for (Double nota : a1.getNotas()) {
            finales = finales + nota;
        }
        a1.setPromedioFinal(finales / 3);

    }

    public void BuscarAlumno() {
        String aux;
        System.out.println("ingrese el alumno a buscar notas y promedio");
        aux = leer.next();
        boolean aux1 = true;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(aux)) {
                aux1 = false;
                System.out.println(lista.get(i).toString());
            }
        }
        if (aux1 != false) {
            System.out.println("alumno no encontrado");
        }

    }

    public void MostrarAlumnos() {
        System.out.println("hay " + lista.size() + " alummnos ");

        lista.forEach((lista1) -> {
            System.out.println(lista1);
        });
    }

}

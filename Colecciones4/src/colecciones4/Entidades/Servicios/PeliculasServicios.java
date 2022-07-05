/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4.Entidades.Servicios;

import colecciones4.Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculasServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Peliculas> pelis = new ArrayList();

    public ArrayList<Peliculas> CrearPelis() {
        int op;
        do {
            System.out.println("desea ingresar una pelicula?");
            System.out.println("   (1)Si   // (2) No");
            op = leer.nextInt();

            if (op == 1) {
                pelis.add(AñadirPelis());
            }

        } while (op != 2);

        return pelis;
    }

    public Peliculas AñadirPelis() {

        Peliculas p1 = new Peliculas();

        System.out.println("ingrese titulo de la pelicula");
        p1.setTitulo(leer.next());
        System.out.println("ingrese el director");
        p1.setDirector(leer.next());
        System.out.println("ingrese la duracion en hs");
        p1.setDuracion(leer.nextInt());

        return p1;
    }

    public void MostrarPeliculas() {

        pelis.stream().map((peli) -> {
            System.out.println("--------las peliculas actuales son---------");
            return peli;
        }).forEachOrdered((peli) -> {
            System.out.println(peli);
        });
    }

    public void OrdenPeliculas(Peliculas p1) {
        int op;

        do {
            System.out.println("  que orden desea ver?");
            System.out.println("      Mayor1Hora  (1) ");
            System.out.println("     SegunHsMayor (2) ");
            System.out.println("     SegunHsMenor (3) ");
            System.out.println("       Titulo     (4) ");
            System.out.println("      Director    (5) ");
            System.out.println("       salir      (6) ");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    Mayor1Hora(p1);
                    break;
                case 2:
                    Collections.sort(pelis, SegunHsMayor);
                    for (Peliculas peli : pelis) {
                        System.out.println(peli);
                    }
                    break;
                case 3:
                    Collections.sort(pelis, SegunHsMenor);
                    for (Peliculas peli : pelis) {
                        System.out.println(peli);
                    }
                    break;
                case 4:
                    Collections.sort(pelis, Titulo);
                    for (Peliculas peli : pelis) {
                        System.out.println(peli);
                    }
                    break;
                case 5:
                    Collections.sort(pelis, Director);
                    for (Peliculas peli : pelis) {
                        System.out.println(peli);
                    }
                    break;
                case 6:
                    System.out.println("hasta pronto");
                    break;
            }

        } while (op != 6);
        
    }

    public void Mayor1Hora(Peliculas p1) {

        System.out.println("las peliculas que duran 1hs o mas son: ");

        for (int i = 0; i < pelis.size(); i++) {
            
            if (pelis.get(i).getDuracion() > 1) {
                System.out.println(pelis.toString());
            } else {
                System.out.println("no hay peliculas");
            }
        }

    }

    public static Comparator<Peliculas> SegunHsMayor = (Peliculas t, Peliculas t1) -> t1.getDuracion().compareTo(t.getDuracion());

    public static Comparator<Peliculas> SegunHsMenor = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Peliculas> Titulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Peliculas> Director = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}

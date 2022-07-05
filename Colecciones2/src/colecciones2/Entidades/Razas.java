/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones2.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Razas {

    Scanner leer = new Scanner(System.in);
    public  ArrayList<String> razas;

    public Razas() {
        this.razas = new ArrayList();
    }

    public Razas AñadirRazas() {
        String aux;
        int op;

        do {
            System.out.println("   añadir raza? (1)");
            System.out.println("   salir (2)");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("ingrese razas de perros");
                    aux = leer.next();
                    razas.add(aux);
                    break;
                case 2:
                    System.out.println("hasta pronto");
                    break;
            }
        } while (op != 2);

        return new Razas();
    }
    
    public void  MostrarRazas(){
        System.out.println("las razas son: ");
        razas.forEach((raza) -> {
            System.out.println(raza);
        });   
    }

}

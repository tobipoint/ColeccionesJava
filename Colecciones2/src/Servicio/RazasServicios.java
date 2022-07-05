/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones2.Entidades.Razas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RazasServicios {

    Scanner leer = new Scanner(System.in);
    
    public ArrayList<String> razas;

    public RazasServicios() {
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
                    break;
            }
        } while (op != 2);

        return new Razas();
    }

    public void MostrarRazas() {
        System.out.println("las razas actuales son: ");
        razas.forEach((raza) -> {
            System.out.println(raza);
        });
        
    }

    public void PerdirPerro() {
        String aux;
        System.out.println("ingrese una raza a buscar y retirar");
        aux = leer.next();

        for (int i = 0; i < razas.size(); i++) {
            if (aux.equals(razas.get(i))) {
                razas.remove(aux);
            } else {
                System.out.println("la raza no se ha encontrado");
            }
        }

        System.out.println("------las razas que quedan son------");
        razas.forEach((raza) -> System.out.println(raza));

    }

}

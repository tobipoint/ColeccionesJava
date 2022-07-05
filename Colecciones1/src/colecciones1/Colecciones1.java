/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<String> razas = new ArrayList();
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

        razas.forEach((raza1) -> {
            System.out.println(raza1);
        });
    }

}

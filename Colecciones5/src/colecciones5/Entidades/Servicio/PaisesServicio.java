/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5.Entidades.Servicio;

import colecciones5.Entidades.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in);

    TreeSet<Paises> Pais = new TreeSet();

    public TreeSet<Paises> AñadirPais() {
        int op;

        do {
            System.out.println("desea ingresar un pais?");
            System.out.println("(1)Si // (2) No");
            op = leer.nextInt();
            if (op == 1) {
                Pais.add(CrearPaises());
            }
        } while (op != 2);

        return Pais;
    }

    public Paises CrearPaises() {
        Paises p1 = new Paises();

        System.out.println("ingrese paises");
        p1.setPais(leer.next());

        return p1;
    }

    public void MostrarOrden() {

        Pais.forEach((Paises1) -> {
            System.out.println(Paises1);
        });
    }

    public void SacarPais() {
        String aux;
        System.out.println("ingrese un pais a eliminar");
        aux = leer.next();

        Iterator<Paises> it = Pais.iterator();

        while (it.hasNext()) {
            Paises aux1 = it.next();
            if (aux1.getPais().equals(aux)) {
                it.remove();
            } 
        }
        MostrarOrden();
    }

}

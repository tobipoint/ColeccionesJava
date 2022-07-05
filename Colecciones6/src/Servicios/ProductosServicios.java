/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import colecciones6.Entidades.Productos;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProductosServicios {

    Scanner leer = new Scanner(System.in);
    HashMap <String, Integer> Producto = new HashMap();

    public void CrearProducto() {
        
        Productos p1 = new Productos();

        System.out.println("ingrese producto");
        p1.setProducto(leer.next());

        System.out.println("ingrese el precio");
        p1.setPrecios(leer.nextInt());

        Producto.put(p1.getProducto(), p1.getPrecios());

    }

    public HashMap<String, Integer> AñadirProducto() {
        int op;
        do {

            System.out.println("    que desea realizar?    ");
            System.out.println("   introducir producto  (1)");
            System.out.println("   modificar precio     (2)");
            System.out.println("   eliminar un producto (3)");
            System.out.println("   mostrar los productos(4)");
            System.out.println("         salir          (5)");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    CrearProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("hasta pronto");
                    break;
            }

        } while (op != 5);

        return Producto;
    }

    public void modificarPrecio() {
        String aux;
        int aux1;

        System.out.println("que producto desea cambiar el precio?");
        aux = leer.next();

        System.out.println("ingrese precio actualizado");
        aux1 = leer.nextInt();

        Producto.replace(aux, aux1);

    }

    public void eliminarProducto() {

        String aux;
        System.out.println("que producto desea eliminar?");
        aux = leer.next();

        Producto.remove(aux);

        System.out.println("producto removido con exito");

    }

    public void mostrarProductos() {

        System.out.println("---------LOS PRODUCTOS ACTUALES SON:-------");

        Producto.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(" " + key + " = $" + value);
        });

        System.out.println("-------------");
    }

}

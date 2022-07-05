/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;

import colecciones5.Entidades.Paises;
import colecciones5.Entidades.Servicio.PaisesServicio;

/**
 *
 * @author Usuario
 */
public class Colecciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServicio ps = new PaisesServicio();
        Paises p1 = new Paises();
        ps.AñadirPais();
        System.out.println("//paises repetidos no seran mostrados//");
        System.out.println("-----ORDENADOS----");
        ps.MostrarOrden();
        System.out.println("----SACAR PAIS----");
        ps.SacarPais();
        
    }
    
}

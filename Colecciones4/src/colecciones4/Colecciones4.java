/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import colecciones4.Entidades.Peliculas;
import colecciones4.Entidades.Servicios.PeliculasServicios;

/**
 *
 * @author Usuario
 */
public class Colecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculasServicios ps = new PeliculasServicios();
        Peliculas p1 = new Peliculas();
        
        ps.CrearPelis();
        ps.MostrarPeliculas();
        ps.OrdenPeliculas(p1);
        
        
    }
    
}

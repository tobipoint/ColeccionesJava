/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4.Entidades;

/**
 *
 * @author Usuario
 */
public class Peliculas {

    public String titulo;
    public String director;
    public Integer duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

   
    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    
    
}

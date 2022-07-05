/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5.Entidades;

/**
 *
 * @author Usuario
 */
public class Paises implements Comparable<Paises> {

    public String pais;

    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int compareTo(Paises t) {
        return this.pais.compareTo(t.getPais());
    }

    @Override
    public String toString() {
        return "Paises{ " + pais + '}';
    }

}

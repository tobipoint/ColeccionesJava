/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6.Entidades;

/**
 *
 * @author Usuario
 */
public class Productos implements Comparable<Productos> {

    public int precios;
    public String Producto;

    public Productos() {
    }

    public Productos(int precios, String Producto) {
        this.precios = precios;
        this.Producto = Producto;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    @Override
    public int compareTo(Productos t) {
        return this.Producto.compareTo(t.getProducto());
    
    }

    @Override
    public String toString() {
        return "Productos{"+ Producto + " precios = " + precios + '}';
    }

}

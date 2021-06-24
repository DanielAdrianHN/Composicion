/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author dania
 */
public class Ventana {

    private String Material;
    private Color color;
    private float ancho;
    private float largo;

    public Ventana() {
    }

    public Ventana(String Material, Color color, float ancho, float largo) {
        this.Material = Material;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ventana{" + "Material=" + Material + ", color=" + color + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
    public void abrir() {
        System.out.println("Abriendo puerta");
    }

    public void cerrar() {
        System.out.println("Cerrando puerta");
    }

}

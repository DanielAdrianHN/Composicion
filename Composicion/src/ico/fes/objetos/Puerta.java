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
public class Puerta {

    private String Meterial;
    private Color color;
    private Boolean vidrio;

    public Puerta() {
    }

    public Puerta(String Meterial, Color color, Boolean vidrio) {
        this.Meterial = Meterial;
        this.color = color;
        this.vidrio = vidrio;
    }

    public String getMeterial() {
        return Meterial;
    }

    public void setMeterial(String Meterial) {
        this.Meterial = Meterial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getVidrio() {
        return vidrio;
    }

    public void setVidrio(Boolean vidrio) {
        this.vidrio = vidrio;
    }

    @Override
    public String toString() {
        return "Puerta{" + "Meterial=" + Meterial + ", color=" + color + ", vidrio=" + vidrio + '}';
    }

    public void abrir() {
        System.out.println("Abriendo puerta");
    }

    public void cerrar() {
        System.out.println("Cerrando puerta");
    }

    public boolean setMeterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

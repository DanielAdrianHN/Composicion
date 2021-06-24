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
public class PuertaDeSeguridad extends Puerta{
    private String mecanismo;
    private String contrasena;

    public PuertaDeSeguridad() {
    }

    public PuertaDeSeguridad(String mecanismo, String contrasena) {
        this.mecanismo = mecanismo;
        this.contrasena = contrasena;
    }

    public PuertaDeSeguridad(String mecanismo, String contrasena, String Meterial, Color color, Boolean vidrio) {
        super(Meterial, color, vidrio);
        this.mecanismo = mecanismo;
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public String toString() {
        return super.toString() + "PuertaDeSeguridad{" + "mecanismo=" + mecanismo + ", contrasena=" + contrasena + '}';
    }
    public void verificar(){
        System.out.println("Verificando...");
    }

    @Override
    public void abrir() {
        System.out.println("Este es el metodo sobre escrito");
        this.verificar();
        super.abrir(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

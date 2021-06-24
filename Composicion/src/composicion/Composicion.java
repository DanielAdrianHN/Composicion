/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.iu.MiVeantana;
import ico.fes.objetos.Muro;
import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuertaDeSeguridad;
import ico.fes.objetos.Ventana;

import java.awt.Color;
import javax.sound.midi.MidiEvent;

/**
 *
 * @author dania
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muro m1= new Muro(3.5f,4.5f,3f, Color.gray, null, new Puerta("Madera", Color.white, false) );
        
        System.out.println( m1.getAlto() +"mts. de alto");
        System.out.println(m1.getPuerta() .getMeterial());
        System.out.println(m1);
    
        System.out.println("-------Puerta de aluminio color azul y una ventana en el muro.--------");
        //Puerta de aluminio color azul y una ventana en el muro.

        m1.getPuerta().setMeterial("Aluminio");
        m1.getPuerta()  .setColor(Color.blue);
        Ventana[] ventanal = new Ventana[1];
        ventanal[0] = new Ventana("Aluminio", Color.blue, 0.5f, 1.0f);
          m1.setVentanas(ventanal);
          System.out.println(m1);
          System.out.println(m1.getVentanas()[0]);
        
          System.out.println(" ------Herencia-------- ");
          PuertaDeSeguridad puerta1=new PuertaDeSeguridad();
          puerta1.setColor(Color.yellow);
          puerta1.cerrar();
          System.out.println(puerta1);
          
          PuertaDeSeguridad Puerta2 = new PuertaDeSeguridad("Chapa electronica", "patito", "Metal", Color.gray, false);
          
          System.out.println(Puerta2);
          Puerta2.setColor(Color.red);
          System.out.println(Puerta2); 
          Puerta2.abrir();
          //ejemplo de herencia
          
         // MiVeantana ventanita= new MiVeantana();
    }
    
}

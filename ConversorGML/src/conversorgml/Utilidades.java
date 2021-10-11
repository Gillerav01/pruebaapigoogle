/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorgml;

import java.util.ArrayList;

/**
 *
 * @author DAW209
 */
public class Utilidades {
    
     public static ArrayList<Punto> crearPuntos(String[] array) {
        ArrayList<Punto> puntos = new ArrayList<>();
        for (int i = 0; i < array.length; i+=2) {
            puntos.add(new Punto(Double.parseDouble(array[i+1]), Double.parseDouble(array[i])));
        }
        return puntos;
    }
}

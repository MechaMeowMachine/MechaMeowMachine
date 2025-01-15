/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raio;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Raio {
    public static double calculaVolume(double r) {
        double v;
        
        v = (4.0 / 3.0)*3.14*r*r*r;
        return v;
 
}

    public static void main(String[] args) {
        double raio, volume;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
        volume = calculaVolume(raio);
        JOptionPane.showMessageDialog(null, "Volume da esfera = " + volume);
        
    }
}


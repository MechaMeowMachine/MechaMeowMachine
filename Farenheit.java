/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farenheit;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Farenheit {
    public static double graus(double f) {
        double c;
        
        c = (5.0/9.0) * (f - 32);
        return c;
    }

    public static void main(String[] args) {
        double faren;
        
        faren = Double.parseDouble(JOptionPane.showInputDialog("Digite os graus em Farenheit: "));
        JOptionPane.showMessageDialog(null, "Graus em Centígrados: " + graus(faren));
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diabo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Diabo {
    public static void bhaskara(double a, double b, double c) {
        double delta, x1, x2;
        
        delta = (b*b) - (4 * a * c);
        JOptionPane.showMessageDialog(null, "Delta =  " + delta);
        
        if (delta < 0)
            JOptionPane.showMessageDialog(null, "A equação não possui raíses reais");
            else 
                if (delta >= 0) {
                    JOptionPane.showMessageDialog(null, "A equação possui duas raíses reais");
                    x1 =  (- b + Math.sqrt(delta))/(2*a);
                    x2 = (- b - Math.sqrt(delta))/(2*a);
                    JOptionPane.showMessageDialog(null, "Raíses = " + x1 + " e " + x2);
                }
    }

    public static void main(String[] args) {
        double n1, n2, n3;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um coeficiente relativo a uma equação de segundo grau: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um: "));
        bhaskara(n1, n2, n3);
        
        
    }
}


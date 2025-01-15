/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aumento;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Aumento {
    public static void AUMENTO(double x, double y) {
        double a, t;
        
        a = x * (y/100);
        t = x + a;
        
        JOptionPane.showMessageDialog(null, "Valor aumentado em " + y + "% = " + t);
        
    }

    public static void main(String[] args) {
        double n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
        AUMENTO(n1, n2);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media4valores;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Media4Valores {
    public static double media(double v1, double v2, double v3, double v4) {
        double m, s;
        
        s = v1 + v2 + v3 + v4;
        m = s/4;
        return(m);
    }

    public static void main(String[] args) {
        double valor1, valor2, valor3, valor4;
        
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
        valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
        valor4 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um valor(esse é o último): "));
        JOptionPane.showMessageDialog(null,"Média = " + media(valor1, valor2, valor3, valor4));
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hipotenusafuncao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class HipotenusaFuncao {
    public static double hipotenusa(double c1, double c2) {
        double h;
        
        h = Math.sqrt(c1*c1*c2*c2);
        return h;
    }

    public static void main(String[] args) {
        double cat1, cat2;
        
        cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto"));
        cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto: "));
        JOptionPane.showMessageDialog(null, "Hipotenusa = " + hipotenusa(cat1, cat2));
    }
}


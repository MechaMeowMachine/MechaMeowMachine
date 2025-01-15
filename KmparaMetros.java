/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kmparametros;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class KmparaMetros {
    public static double metro(double km) {
        double m;
        
        m = km * 1000;
        return m;
    }

    public static void main(String[] args) {
        double gatoListrado;
        
        gatoListrado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em km: "));
        JOptionPane.showMessageDialog(null, "" + metro(gatoListrado));
    }
}


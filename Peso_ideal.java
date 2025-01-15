/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peso_ideal;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Peso_ideal {
    public static void peso_ideal(double x, int y) {
        double h, m;
        
        if (y == 1) {
            h = 72.7 * x - 58;
            JOptionPane.showMessageDialog(null, "Peso ideal = " + h);
        }
        else
            if (y == 2) {
                m = 62.1 * x - 44.7;
                JOptionPane.showMessageDialog(null, "Peso ideal = " + m);
            }
    }

    public static void main(String[] args) {
        double a;
        int s;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        s = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo (2)Feminino (1)Masculino: "));
        peso_ideal(a, s);
        
    }
}


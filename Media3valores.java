/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media3valores;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Media3valores {

        public static void MEDIA(double X, double Y, double Z) {
        double s, m;
        s = X + Y + Z;
        m = s/3;
        JOptionPane.showMessageDialog(null, "Média = " + m);
    }

    public static void main(String[] args) {
        double v1, v2, v3;
        
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
        v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um valor(esse é o último): "));
        MEDIA(v1, v2, v3);
    }
}


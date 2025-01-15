/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.volume_esfera;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Volume_esfera {
    public static void volume_esfera(double r) {
        double v;
        
        v = 4.0/3.0*3.14*r*r*r;
        
        JOptionPane.showMessageDialog(null, "Volume = " + v);
    }

    public static void main(String[] args) {
        double r;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite um raio de uma esfera: "));
        volume_esfera(r);
                
    }
}


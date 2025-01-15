/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metado;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Metado {
    public static void METADE(double acelora_orion_heart_under_blade) {
        double div;
        div = acelora_orion_heart_under_blade/2;
        JOptionPane.showMessageDialog(null, "Metade = " + div);
    }

    public static void main(String[] args) {
        double v;
        
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        METADE(v);    
    }
}


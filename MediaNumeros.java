/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.medianumeros;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class MediaNumeros {

    public static void main(String[] args) {
        double n, m, s = 0;
        int i;
        
        for (i = 1; i <= 520; i++){
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        s = s + n;
        }
        m = s/20;
        JOptionPane.showMessageDialog(null, "Média = " + m);
    }
}


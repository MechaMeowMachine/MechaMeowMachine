/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaimpares;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class SomaImpares {

    public static void main(String[] args) {
        int i;
        double n, s = 0;
        
        for (i = 1; i <= 5; i++){
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            if (n % 2 != 0)
                s = s + n;
        }
        JOptionPane.showMessageDialog(null, "Soma dos ímpares = " + s);
    }
}


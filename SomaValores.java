/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somavalores;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class SomaValores {

    public static void main(String[] args) {
        int i;
        double n, s = 0;
        
        for (i = 1; i <= 50; i++){
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        s = s + n;
        }
        JOptionPane.showMessageDialog(null, "Soma = " + s);
    }
}



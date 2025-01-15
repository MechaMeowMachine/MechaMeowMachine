/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaentrenumeros;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class SomaEntreNumeros {
    public static void soma(int n) {
        int i, s = 0;
        
        for (i = 1; i <= n; i++) {
            s = s + i;
        }
        JOptionPane.showMessageDialog(null, "Soma = " + s);
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        soma(num);
    }
}



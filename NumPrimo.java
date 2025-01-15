/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numprimo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class NumPrimo {
    public static void NUM_PRIMO(int x) {
        int i;
        if (x <= 1) 
            JOptionPane.showMessageDialog(null, "O número não é primo");
        else {
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    JOptionPane.showMessageDialog(null, "O número não é primo");
                    return;
                
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O número é primo");
    }
    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        NUM_PRIMO(n);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primo;
import javax.swing.JOptionPane;
/**
 *
 * @author jhull
 */
public class Primo {
    public static void primo(int n) {
        int i;
        if (n <= 1)
            JOptionPane.showMessageDialog(null, "O número não é primo");
        else
            for (i = 2; i < n; i++)
                if (n % i == 0) {
                    JOptionPane.showMessageDialog(null, "O número não é primo");
                    return;
                }
        JOptionPane.showMessageDialog(null, "O número é primo");
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        primo(num);
        
    }
}


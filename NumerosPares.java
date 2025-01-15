/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class NumerosPares {

    public static void main(String[] args) {
        int i, cont = 0;
        double n;
        
        for (i = 1; i <= 5; i++){
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            if (n % 2 == 0)
                cont = cont + 1;
        }
        JOptionPane.showMessageDialog(null, "Números pares digitados: " + cont);
    }
}


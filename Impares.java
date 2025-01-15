/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impares;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Impares {
    public static void impar(int n) {
        int i;
        
        for (i = n; i > 0; i--) {
            if (i % 2 != 0)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        impar(num);
    }
}


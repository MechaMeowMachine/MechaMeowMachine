/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordemcrescente;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class OrdemCrescente {
    

    public static void main(String[] args) {
        int temp, a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Comparação e ordenação dos três números
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Os números em ordem crescente são: " + a + ", " + b + ", " + c);
    }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordemcrescentemodularizacao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class OrdemCrescenteModularizacao {

     public static void ordem_crescente(int a, int b, int c) {
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        JOptionPane.showMessageDialog(null, "Números em ordem crescente = " + a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        int n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número: "));
        ordem_crescente(n1, n2, n3);
    }
}



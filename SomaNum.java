/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somanum;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class SomaNum {
    public static void soma(int a, int b) {
        int s = 0, i;
        
        if (a > b) {
            for (i = b; i < (a+1); i++) {
                s = s + i;
            }
        JOptionPane.showMessageDialog(null, "Soma de todos os números entre " + a + " e " + b + " = " + s);
        }
        else
            if (b > a) {
                for (i = a; i < (b+1); i++) {
                    s = s + i;
                }
            JOptionPane.showMessageDialog(null, "Soma de todos os números entre " + a + " e " + b + " = " + s);
            }
    }

    public static void main(String[] args) {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        soma(n1, n2);
    }
}


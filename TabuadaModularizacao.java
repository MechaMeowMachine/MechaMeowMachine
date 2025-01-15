/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadamodularizacao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class TabuadaModularizacao {
    public static void tabuada(int n) {
        int i, t;
        
        for (i = 1; i <= 10; i++) {
            t = n * i;
            System.out.println(n + " x " + i + " = " + t + "\n");
        }
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        tabuada(num);
    }
}


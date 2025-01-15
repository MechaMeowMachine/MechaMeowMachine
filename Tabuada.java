/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Tabuada {

    public static void main(String[] args) {
        int n, t = 0, cont = 1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while (t != n * 10){
            t = n * cont;
            JOptionPane.showMessageDialog(null, n + " X " + cont + " = " + t);
            cont = cont + 1;
        }
    }
}



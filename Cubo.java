/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cubo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Cubo {
    public static int cubo(int n) {
        int c;
        
        c = n*n*n;
        return(c);
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null, "Cubo do número = " + cubo(num));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixas;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Caixas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a, b, c, d = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da primeira caixa: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da segunda caixa: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da terceira caixa: "));
        
       if (a > b && b > c)
           d = 1;
       
       else
           if (a == b && b > c)
               d = 2;
       
       else
           if (b == c && a > b)
               d = 2;
       else
           if (b == c && a == b)
               d = 3;
       
        JOptionPane.showMessageDialog(null, "Viajens que o drone terá que fazer = " + d);
    }
}


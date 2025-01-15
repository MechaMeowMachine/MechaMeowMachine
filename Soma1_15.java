/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma1_15;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Soma1_15 {

      public static int soma() {
        int s = 0, i = 1;
        
        while (i <= 15) {
            s = s + i;
            i = 1 + i;
        }
        return(s);
}

    public static void main(String[] args) {
        int n;
        
        n = soma();
        JOptionPane.showMessageDialog(null, "Soma dos números de 1 a 15 = " + n);
        
    }
}


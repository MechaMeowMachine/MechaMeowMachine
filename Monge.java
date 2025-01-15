/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monge;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Monge {

    public static void main(String[] args) {
        int g = 1, cont = 1, s = 0;
       
      
        while (cont != 6){
            s = s + g;
            g = g * 2;
            
            cont = cont + 1;
            
        }
        JOptionPane.showMessageDialog(null, "Grãos a pagar = " + s);
    }
}


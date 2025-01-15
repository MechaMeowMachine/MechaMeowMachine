/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decrescente;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Decrescente {

    public static void main(String[] args) {
        int n = 1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while (n != 0){
            n = n - 1;
            JOptionPane.showMessageDialog(null,n);   
        }
    }
}



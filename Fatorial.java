/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Fatorial {

    public static void main(String[] args) {
        int n, f = 1, i = 1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        while (i <= n){
            f = f * i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "O " + n + "! é = " + f);
        }
        
    }
        


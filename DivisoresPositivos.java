/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisorespositivos;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class DivisoresPositivos {
    public static void divisores(int gatinhopreto){
        int i = 1;
        
        while (i <= gatinhopreto) {
           if (gatinhopreto % i == 0)
                System.out.println(i);
            i++;
        }
           
    }
    public static void main(String[] args) {
        int gatinhobranco;
        
        gatinhobranco = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        divisores(gatinhobranco);
    }
}


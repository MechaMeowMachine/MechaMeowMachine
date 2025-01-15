/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiornumero;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class MaiorNumero {
    public static int maior(int gatinhoMacio, int gatinhoBranquinho) {
        
        if (gatinhoMacio > gatinhoBranquinho) 
           return gatinhoMacio;
        
        else 
            return gatinhoBranquinho;
    }

    public static void main(String[] args) {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        JOptionPane.showMessageDialog(null, "Número maior = " + maior(n1, n2));
    }
}

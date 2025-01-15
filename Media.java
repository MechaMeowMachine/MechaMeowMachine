/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Media {
    public static double calculaMedia(double a, double b, double c, int op) {
        double m;
         
        if (op == 1)
            m = (a + b + c)/3;
        else 
            m = ((a * 5) + (b * 3) + (c * 2))/(5 + 3 + 2);
        
        return m; 
    }
  
    public static void main(String[] args) {
        double n1, n2, n3, m;
        int opc;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja (1)Média Aritmética (2)Média Ponderada: "));
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a tercira nota: "));
        m = calculaMedia(n1, n2, n3, opc);
    }
}


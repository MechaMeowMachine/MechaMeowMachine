/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class MediaAritmetica {
    public static double media(double a, double b, double c) {
        double m, s;
        
        s = a + b + c;
        m = s/3;
        return(m);
        
    } 

    public static void main(String[] args) {
        double n1, n2, n3;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a tercira nota: "));
        JOptionPane.showMessageDialog(null, "Média = " + media(n1, n2, n3));

    }
}


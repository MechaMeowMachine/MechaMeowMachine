/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caracteres;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Caracteres {

    public static String caracteres(int n) {
        
        if (n == 1)
            return("DOM");
        else
            if (n == 2)
                return("SEG");
        else
            if (n == 3)
                return("TER");
        else
            if (n == 4)
                return("QUA");
        else
            if (n == 5)
                return("QUI");
        else
            if (n == 6)
                return("SEX");
        else
            if (n == 7)
                return("SAB");
        else
                return "Número inválido";
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null,  "" + caracteres(num));
    }
}

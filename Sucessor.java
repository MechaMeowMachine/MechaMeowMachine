/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucessor;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Sucessor {
    public static int sucessor(int n) {
        int s;
        
        s = n + 1;
        return(s);
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null, "Sucessor = " + sucessor(num));
    }
}

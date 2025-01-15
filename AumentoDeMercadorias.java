/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aumentodemercadorias;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class AumentoDeMercadorias {
    public static void reajuste(double valour) {
        double r, a;
        
        a = valour * (10.0/100.0);
        r = valour + a;
        JOptionPane.showMessageDialog(null,"a = " + a +  "\nReajuste = " + r);
        
    }

    public static void main(String[] args) {
        double v;
        int c = 1;
        
        while (c == 1) {
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria: "));
        reajuste(v);
        c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não "));
        }
    }
}

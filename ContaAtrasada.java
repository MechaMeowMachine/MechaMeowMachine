/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaatrasada;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class ContaAtrasada {
    public static double pagar(double vorg, int d) {
        double p = 0;
        int i;
        
        for (i = 1; i <= d; i++) {
        p = vorg * 2;
        }
    return(p);
    }

    public static void main(String[] args) {
        double valorOriginal;
        int dias;
        
        valorOriginal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor original da conta: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias de atraso: "));
        JOptionPane.showMessageDialog(null, "Valor a pagar = " + pagar(valorOriginal, dias));
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comissaocalculada;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class ComissaoCalculada {

    public static void main(String[] args) {
        int i;
        double v, c = 0;
        String n;
        
        for (i = 1; i<= 5; i++){
        JOptionPane.showMessageDialog(null, "BEM VINDO A IMOBILIÁRIA VENTE TUDO!");
        n = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda: "));
        if (v > 50000){
            c = (v*12)/100;
        JOptionPane.showMessageDialog(null, "Nome = " + n + "\nValor de venda = " + v + "\nComissão = " + c);
        }
        else
            if (v >= 30000 && v <= 50000){
                c = (v*9.5)/100;
        JOptionPane.showMessageDialog(null, "Nome = " + n + "\nValor de venda = " + v + "\nComissão = " + c);
        }
        else
           c = (v*7)/100;
        JOptionPane.showMessageDialog(null, "Nome = " + n + "\nValor de venda = " + v + "\nComissão = " + c);
        }
    }
}



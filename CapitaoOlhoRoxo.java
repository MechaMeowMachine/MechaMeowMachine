/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitaoolhoroxo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class CapitaoOlhoRoxo {

    public static void main(String[] args) {
        int moedas, marinheiros, mpm, c, tot;
        
        moedas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de moedas: "));
        marinheiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de marinheiros: "));
        tot = marinheiros + 2;
        if (moedas % tot == 0){
            mpm = moedas/tot;
            c = mpm * 2;
            JOptionPane.showMessageDialog(null, "O Capitão Olho Roxo recebeu " + c + " moedas");
        }
        else
            JOptionPane.showMessageDialog(null, "Divisão perfeita não é possível, sem moedas para o Capitão Olho Roxo");
    }
}

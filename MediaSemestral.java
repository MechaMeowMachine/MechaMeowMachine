/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediasemestral;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class MediaSemestral {
    public static void media(String n, double a, double b) {
        double m, s;
        
        s = a + b;
        m = s/2;
        
        if (m >= 60)
            JOptionPane.showMessageDialog(null, n + " " + m + " PARABÉNS! Você foi aprovado!");
        else
            JOptionPane.showMessageDialog(null, n + " " + m + " ESTUDE! Você está de recuperação");
    }

    public static void main(String[] args) {
        double n1, n2;
        String nome;
        int c = 1;
        
        while (c == 1){
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
        media(nome, n1, n2);
        c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não "));
        }
    }
}

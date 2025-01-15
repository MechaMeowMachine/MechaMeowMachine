/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media2notas;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Media2Notas {

    public static void main(String[] args) {
        double n1, n2, m;
        int c = 1;
        
        while (c == 1){
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite 2ª nota: "));
            m = (n1 + n2)/2;
            JOptionPane.showMessageDialog(null, "Média do aluno = " + m);
            c = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro aluno? (1)Sim (2)Não "));
        }
    }
}


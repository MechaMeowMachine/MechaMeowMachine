/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aumentodesalario;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class AumentoDeSalario {

    public static void main(String[] args) {
        double s, nv, a;
        int c;
        
        s = Double.parseDouble(JOptionPane.showInputDialog("Digite seu slário: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite seu cargo: (1)Gerente (2)Técnico  "));
        if (c == 1) {
            a = (s * 10)/100;
            nv = s + a;
            JOptionPane.showMessageDialog(null, "Novo salário = " + nv);
        } 
        else
            if (c == 2){
                a = (s * 30)/100;
                nv = s + a;
                JOptionPane.showMessageDialog(null, "Novo salário = " + nv);
            }
    }
}


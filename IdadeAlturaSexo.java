/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadealturasexo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class IdadeAlturaSexo {

    public static void main(String[] args) {
        int i, s, c = 10001,cont = 0, conth = 0, si = 0;
        double a, sam = 0;
        
        while (c == 10001){
        i = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        s = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo: (1)Feminino (2)Masculino "));
        if (a >= 1.70 && a >= 2.00)
            cont = cont + 1;
        if (s == 1)
            sam = sam + a;
        if (s == 2 && i > 30)
            conth = conth + 1;
        if (c == 81729)
            JOptionPane.showMessageDialog(null, "Tenha um bom dia! :3");
        si = si + i;
        c = Integer.parseInt(JOptionPane.showInputDialog("Desejas continuar? (10001)Sim (81729)Não "));
        
        }
    }
}


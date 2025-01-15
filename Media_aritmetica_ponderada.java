/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media_aritmetica_ponderada;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Media_aritmetica_ponderada {
    public static void media(double x, double y, double z, int L) {
        double ma, s, p1, p2, p3, sprod, spes, mp;
        
        if (L == 1){
            s = x + y + z;
            ma = s/3;
            JOptionPane.showMessageDialog(null, "Média artmética = " + ma);
        }
        else
            if (L == 2) {
                p1 = x * 5;
                p2 = y * 3;
                p3 = z * 2;
                sprod = p1 + p2 + p3;
                spes = 5 + 3 + 2;
                mp = sprod/spes;
               // mp = ((x*5) + (y*3) + (z*2))/(5 + 3 + 2);
                JOptionPane.showMessageDialog(null, "Média ponderada = " + mp);
            }
            
    }

    public static void main(String[] args) {
        double n1, n2, n3;
        int l;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outra nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais uma nota: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Deseja média (1)Aritmética ou (2)Ponderada? "));
        media(n1, n2, n3, l);
        
    }
}

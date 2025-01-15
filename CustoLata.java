/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.custolata;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class CustoLata {
    public static double custoLata(double r, double h) {
        double c;
        
        c = ((3.14 * r*r * 2) + (2 * 3.14 * r * h)) * 100;
        return c;
    }

    public static void main(String[] args) {
        double rato, alt;
        
        rato = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da lata: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da lata(em metros): "));
        JOptionPane.showMessageDialog(null, "Custo da lata = " + custoLata(rato, alt));
    }
}

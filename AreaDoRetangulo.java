/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areadoretangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class AreaDoRetangulo {
    public static double area(double l, double c) {
        double a;
        
        a = l *c;
        return(a);
        
    } 

    public static void main(String[] args) {
        double larg, comp;
        
        larg = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo: "));
        comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do retângulo: "));
        JOptionPane.showMessageDialog(null, "Área = " + area(larg, comp));
    }
}

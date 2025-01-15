/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearetangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class AreaRetangulo {
    public static double area(double c, double l) {
        double a;
        int i =  1;
      
        a = c * l;
        return a;
    }

    public static void main(String[] args) {
        double comp, larg;
        int i;
        
        for (i = 1; i < 20; i ++) {
        comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do retângulo: "));
        larg = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo: "));
        JOptionPane.showMessageDialog(null, "Área = " + area(comp, larg));
        }
    }
 
}


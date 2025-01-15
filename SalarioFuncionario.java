/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariofuncionario;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class SalarioFuncionario {
    public static double salario(double s, double h) {
        double m;
        
        m = h*s;
        return(m);
        
    }

    public static void main(String[] args) {
        double salario, horas;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário: "));
        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
        JOptionPane.showMessageDialog(null, "Salário = " + salario(salario, horas));
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculasalario;
import javax.swing.JOptionPane;
/**
 *
 * @author 2024108060014
 */
public class CalculaSalario {

    public static void main(String[] args) {
        double nht, vh, salario;
        
        nht = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: "));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que recebe por hora: "));
        salario = nht * vh;
        JOptionPane.showMessageDialog(null, "Seu salário = " + salario);
    }
}


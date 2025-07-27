/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poopessoa;

/**
 *
 * @author jhull
 */
public class POOPessoa {

    public static void main(String[] args) {
        Endereco ed1 = new Endereco("Algum logadouro", 10, "Algum bairro", "Algum CEP", "Alguma cidade", "Algum estado");
        Fornecedor f1 = new Fornecedor(100, 50, "Frederico", "73849563872", ed1, "993748567", "frederico@gmail.com");
        Empregado e1 = new Empregado(9, 1000, 10, "Anacleto", "84736583984", ed1, "946735476", "Anacleto@gmail.com");
        
        f1.exibir();
        f1.obterSaldo();
        e1.exibir();
        e1.calcularSalario();
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poocontabancaria;

/**
 *
 * @author jhull
 */
public class POOContaBancaria {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Rodolfo", "Banco legal", "0683", "83057298", "corrente", 100);
        ContaBancaria c2 = new ContaBancaria("Josisvaldo", "Banco legal", "3752", "88365937", "corrente", 200);
        
        c1.exibir();
        c1.depositar(20);
        c1.exibir();
        c1.transferir(c2, 10);
        c1.exibir();
        c1.depositar(50);
        c1.exibir();
        c1.consultar();
    }
}


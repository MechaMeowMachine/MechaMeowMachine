/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopessoa;

/**
 *
 * @author jhull
 */
public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String nome, String cpf, Endereco endereco, String telefone, String email) {
        super(nome, cpf, endereco, telefone, email);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    
    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public void obterSaldo(){
  
        this.setValorCredito(this.getValorCredito() - this.getValorDivida());
        System.out.println("Saldo: " + this.getValorCredito());
    }
    
    public void exibir(){
        
        System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nLogadoruro: " + this.getEndereco().getLogadouro() + "\nNumero: " + this.getEndereco().getNumero() + "\nBairro: " + this.getEndereco().getBairro() + "\nCEP: " + this.getEndereco().getCep() + "\nCidade: " + this.getEndereco().getCidade() + "\nEstado: " + this.getEndereco().getEstado() + "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail());
        System.out.println("Valor credito: " + this.getValorCredito() + "\nValor divida: " + this.getValorDivida()); 
    }
}


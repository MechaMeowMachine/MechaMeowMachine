/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopessoa;

/**
 *
 * @author jhull
 */
public class Vendedor extends Empregado {
    
    private double valorVendas;
    private double comissao;

    public Vendedor(double valorVendas, double comissao, int codigoSetor, double salarioBase, double imposto, String nome, String cpf, Endereco endereco, String telefone, String email) {
        super(codigoSetor, salarioBase, imposto, nome, cpf, endereco, telefone, email);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
      public double calcularSalario(){
        
        return this.getSalarioBase() - this.getImposto() + (this.getValorVendas() * this.getComissao());
        
    }
      
    @Override
      public void exibir(){
        
        System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail());
        System.out.println("Endereco: " + this.getEndereco().getLogadouro() + "\n" + this.getEndereco().getNumero() + "\n" + this.getEndereco().getBairro() + "\n" + this.getEndereco().getCep() + "\n" + this.getEndereco().getCidade() + "\n" + this.getEndereco().getEstado());
        System.out.println("Valor vendas: " + this.getValorVendas() + "Comissao: " + this.getComissao());
        System.out.println("Salario: " + this.calcularSalario());
    }
}


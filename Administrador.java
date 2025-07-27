/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopessoa;

/**
 *
 * @author jhull
 */
public class Administrador extends Empregado {
    
    private double ajudaDeCusto;

    public Administrador(double ajudaDeCusto, int codigoSetor, double salarioBase, double imposto, String nome, String cpf, Endereco endereco, String telefone, String email) {
        super(codigoSetor, salarioBase, imposto, nome, cpf, endereco, telefone, email);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario(){
        
        return this.getSalarioBase() - this.getImposto()+ this.getAjudaDeCusto();
        
    }
    
    @Override
    public void exibir(){
        
        System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail());
       System.out.println("Endereco: " + this.getEndereco().getLogadouro() + "\n" + this.getEndereco().getNumero() + "\n" + this.getEndereco().getBairro() + "\n" + this.getEndereco().getCep() + "\n" + this.getEndereco().getCidade() + "\n" + this.getEndereco().getEstado());
        System.out.println("Ajuda de custo: " + this.getAjudaDeCusto());
        System.out.println("Salario: " + this.calcularSalario());
    }
    
}


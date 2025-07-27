/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poocarro_motorista;

/**
 *
 * @author jhull
 */
public class Motorista {
    
    private String nome;
    private String cpf;
    private String rg;
    private String cnh;
    private String data_nascimento;
    private Carro carro;

    public Motorista(String nome, String cpf, String rg, String cnh, String data_nascimento, Carro carro) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cnh = cnh;
        this.data_nascimento = data_nascimento;
        this.carro = carro;
    }


    public Carro getCarro() {
        return carro;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getCnh() {
        return cnh;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public void dirigir(){
        System.out.println("O motorista esta dirigindo");
    }
    
    public void multa(double velocidade_maxima, double salario){
        double m;
        
        if(this.getCarro().getVelociade() - velocidade_maxima == 30){
            m = salario * 0.2;
            System.out.println("Multa = " + m);
        }
        else
            if(this.getCarro().getVelociade() - velocidade_maxima > 30){
                m = salario * 0.4;
                System.out.println("multa = " + m);
            }
        else
                System.out.println("Dentro da velocidade permitida");
    }
    
    public void exibir(){
        System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nRG: " + this.getRg() + "\nCNH: " + this.getCnh() + "\nData de nascimento: " + this.getData_nascimento());
        System.out.println("Cor: " + this.getCarro().getCor() + "\nModelo: " + this.getCarro().getModelo() + "\nMarca: " + this.getCarro().getMarca() + "\nVelocidade: " +  this.getCarro().getVelociade());
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poojogadordefutebol;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jhull
 */
public class JogadorDeFutebol {
    
    private String nome;
    private LocalDate data_nascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    private String posicao;
    private Uniforme uniforme;

    public JogadorDeFutebol(String nome, LocalDate data_nascimento, String nacionalidade, double altura, double peso, String posicao, Uniforme uniforme) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.uniforme = uniforme;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public Uniforme getUniforme() {
        return uniforme;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setUniforme(Uniforme uniforme) {
        this.uniforme = uniforme;
    }

    public double calculaIdade(){
        double idade;
        
        idade = ChronoUnit.YEARS.between(this.getData_nascimento(), LocalDate.now());
        return idade;
    }
    
    public void exibir(){
        System.out.println("Nome: " + this.getNome() + "\nNacionalidade: " + this.getNacionalidade() + "\nAltura: " + this.getAltura() + "\nPeso: " + this.getPeso() + "\nPosicao: " + this.getPosicao());
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("Idade: " + this.calculaIdade());
        System.out.println("Data de nascimento: " + this.getData_nascimento().format(formatador));
        System.out.println("Cor do calcao: " + this.getUniforme().getCorcalcao() + "\nCor camiseta: " + this.getUniforme().getCorcamiseta() + "\nMeiao: " + this.getUniforme().getMeiao() + "\nNumero: " + this.getUniforme().getNumero());
    }
    
    public void aposentadoria(){
    double idade, t;
        
        idade = ChronoUnit.YEARS.between(this.getData_nascimento(), LocalDate.now());
    
        if(this.getPosicao() == "Defesa"){
            t = 40 - idade;
            if (t > 0){
                System.out.println("Tempo que falta para aposentadoria: " + t);
            }
            else
                System.out.println("Já pode se aposentar");
            
            
        }
        
        else
            if(this.getPosicao() == "Meio-campo"){
                t = 38 - idade;
                if(t > 0){
                    System.out.println("Tempo que falta para aposentadoria: " + t);
                }
                else
                    System.out.println("Já pode se aposentar");
            }
        
        else
            if(this.getPosicao() == "Atacante"){
                t = 35 - idade;
                if(t > 0){
                    System.out.println("Tempo que falta para aposentadoria: " + t);
                }
                else
                    System.out.println("Já pode se aposentar");
            }
 }
}


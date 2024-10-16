/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaiszoologico;

/**
 *
 * @author joao_arthur-santos
 */
public class Animal {

    //Usa-se protected para 
    protected String nome;
    protected String especie;
    protected int idade;
    protected String dieta;
    protected boolean statusSaude;

    //Construtor
    public Animal(String nome, String especie, int idade, String dieta, boolean statusSaude) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.dieta = dieta;
        this.statusSaude = statusSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public boolean isStatusSaude() {
        return statusSaude;
    }

    public void setStatusSaude(boolean statusSaude) {
        this.statusSaude = statusSaude;
    }

    /*método chamado emitirSom() que retorna uma representação do som que o animal faz. 
    Este método será substituído por classes derivadas para fornecer sons específicos de cada animal.*/
    public void emitirSom() {
        System.out.println("");
    }

    /*Implemente um método chamado alimentar(String comida) que aceita uma string representando o tipo 
    de comida que o animal recebe. O método deve verificar se a comida é compatível com a dieta do animal e, 
    se for compatível, atualizar o status de saúde do animal para "saudável". Se a comida não for compatível, 
    o status de saúde deve permanecer o mesmo.*/
    public void alimentar(String comida) {
        if (comida == dieta) {
            statusSaude = true;
        } else {
            statusSaude = false;
        }
    }
}

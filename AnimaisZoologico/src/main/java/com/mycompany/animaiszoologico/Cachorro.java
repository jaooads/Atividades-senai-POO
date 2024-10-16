/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaiszoologico;

/**
 *
 * @author joao_arthur-santos
 */
public class Cachorro extends Animal {

    private String cor;

    public Cachorro(String nome, String especie, int idade, String dieta, boolean statusSaude, String cor) {
        super(nome, especie, idade, dieta, statusSaude);
        this.cor = cor;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    @Override
    public void alimentar(String comida) {
        comida = "Ração";
        if (comida == dieta) {
            statusSaude = true;
        } else {
            statusSaude = false;
        }
    }
}

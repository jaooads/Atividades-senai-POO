/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaiszoologico;

/**
 *
 * @author joao_arthur-santos
 */
public class Leao extends Animal {

    private String origem;

    public Leao(String nome, String especie, int idade, String dieta, boolean statusSaude, String origem) {
        super(nome, especie, idade, dieta, statusSaude);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public void emitirSom() {
        System.out.println("Grr Grr");
    }

    @Override
    public void alimentar(String comida) {
        comida = "Carne";
        if (comida == dieta) {
            statusSaude = true;
        } else {
            statusSaude = false;
        }
    }

}

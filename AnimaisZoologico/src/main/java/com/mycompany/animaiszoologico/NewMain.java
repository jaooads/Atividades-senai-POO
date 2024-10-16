/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.animaiszoologico;

/**
 *
 * @author joao_arthur-santos
 */
public class NewMain {

    public static void main(String[] args) {
        Leao leao1 = new Leao("Simba", "Leao", 5, "Carne", true, "laranja");
        System.out.println(leao1.getNome());
        System.out.println(leao1.getEspecie());
        System.out.println(leao1.getIdade());
        System.out.println(leao1.getDieta());
        System.out.println(leao1.isStatusSaude());
        System.out.println(leao1.getOrigem());

        Elefante elefante1 = new Elefante("Polo", "Elefante", 22, "Folhas", true, "cinza");
        System.out.println(elefante1.getNome());
        System.out.println(elefante1.getEspecie());
        System.out.println(elefante1.getIdade());
        System.out.println(elefante1.getDieta());
        System.out.println(elefante1.isStatusSaude());
        System.out.println(elefante1.getTrompa());

        Pinguim pinguim1 = new Pinguim("Paulo", "Pinguim", 2, "Peixe", true, "Preto");
        System.out.println(pinguim1.getNome());
        System.out.println(pinguim1.getEspecie());
        System.out.println(pinguim1.getIdade());
        System.out.println(pinguim1.getDieta());
        System.out.println(pinguim1.isStatusSaude());
        System.out.println(pinguim1.getCor());

        Vaca vaca1 = new Vaca("Mona", "Vaca", 6, "Trato", true, "Branca");
        System.out.println(vaca1.getNome());
        System.out.println(vaca1.getEspecie());
        System.out.println(vaca1.getIdade());
        System.out.println(vaca1.getDieta());
        System.out.println(vaca1.isStatusSaude());
        System.out.println(vaca1.getRaca());

        Gato gato1 = new Gato("Mel", "Gato", 33, "Ração", true, "marrom");
        System.out.println(gato1.getNome());
        System.out.println(gato1.getEspecie());
        System.out.println(gato1.getIdade());
        System.out.println(gato1.getDieta());
        System.out.println(gato1.isStatusSaude());
        System.out.println(gato1.getCor());

        Cachorro cachorro1 = new Cachorro("Zara", "Cachorro", 5, "Ração", true, "Mescla");
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getEspecie());
        System.out.println(cachorro1.getIdade());
        System.out.println(cachorro1.getDieta());
        System.out.println(cachorro1.isStatusSaude());
        System.out.println(cachorro1.getCor());

    }

}

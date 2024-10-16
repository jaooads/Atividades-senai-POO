/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4;

/**
 *
 * @author joao_arthur-santos
 */
public class Caneta {

    public String marcaCaneta;
    public String materialDoCorpo;
    public String corTinta;
    public String tipoPonta;
    public double qntTinta;
    public boolean recarregavel = true || false;
    public double preco;

    //Metódos
    public void recarregarCaneta() {
        if (recarregavel == true) {
            qntTinta = 100;
        } else {
            System.out.println("Está caneta não é recarregavel!");
        }
    }

    public void escreverTinta() {
        qntTinta = qntTinta - 0.01;
    }

    public void infCaneta() {
        System.out.println("A marca é: " + marcaCaneta);
        System.out.println("O material do corpo é:" + materialDoCorpo);
        System.out.println("A cor da tinta é:" + corTinta);
        System.out.println("O tipo de ponta dela é: " + tipoPonta);
        System.out.println("A quantidade de tinta é: " + qntTinta);
        System.out.println("Recarregavel ? " + recarregavel);
        System.out.println("O preço dela é: " + preco);
    }

}

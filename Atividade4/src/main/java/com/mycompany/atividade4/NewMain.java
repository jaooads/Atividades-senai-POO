/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade4;

/**
 *
 * @author joao_arthur-santos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Caneta caneta1 = new Caneta();

        caneta1.marcaCaneta = "BIC";
        caneta1.materialDoCorpo = "Plástico";
        caneta1.corTinta = "Preto";
        caneta1.tipoPonta = "Esferográfica";
        caneta1.qntTinta = 70;
        caneta1.recarregavel = true;
        caneta1.preco = 5.00;

        caneta1.escreverTinta();
        caneta1.recarregarCaneta();
        caneta1.infCaneta();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade3;

/**
 *
 * @author joao_arthur-santos
 */
public class Produto {

    private int codProd;
    private String marca;
    private String modelo;
    private String desc;
    private double preco;
    private int qntEmEstoque;

    //Construtor
    public Produto(int codProd, String marca, String modelo, String desc, double preco, int qntEmEstoque) {
        this.codProd = codProd;
        this.marca = marca;
        this.modelo = modelo;
        this.desc = desc;
        this.preco = preco;

    }

    public int getcodProd() {
        return codProd;
    }

    public void setcodProd(int novocodProd) {
        codProd = novocodProd;
    }

    // Métodos
    public void mostrarInformacoes() {
        System.out.println("O código do produto é: " + codProd);
        System.out.println("A marca do produto é: " + marca);
        System.out.println("O Modelo do produto é: " + modelo);
        System.out.println("A quantidade em estoque é: " + qntEmEstoque);
        //Construtor
    }

//Método com parâmetro e retorno
    public String adicionarEstoque(int quantidade) {
        qntEmEstoque = qntEmEstoque + quantidade;
        return quantidade + "Unidades adicionadas ao estoque Nova quantidade em estoque" + qntEmEstoque;

    }

    public void retirarQntdEstoque(int quantidade) {
        qntEmEstoque = qntEmEstoque - quantidade;
    }
}

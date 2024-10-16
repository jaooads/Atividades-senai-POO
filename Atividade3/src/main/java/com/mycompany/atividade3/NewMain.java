/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade3;

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

        Produto produto1 = new Produto(0001, "DELL", "Optiplex 3070",
                "Computador DELL Core I7-9700", 3800.00, 0);

        //produto1.codProd = 0001;
        //produto1.marca = "Cassio";
        //produto1.modelo = "CS2013";
        //produto1.desc = "Computador";
        //produto1.preco = 2000.00;
        //produto1.qntEmEstoque = 50;
        produto1.adicionarEstoque(50);
        produto1.retirarQntdEstoque(7);
        produto1.mostrarInformacoes();

        Produto produto2 = new Produto(0002, "Monster", "Energético sem Açucar azul", "Energético sagrado", 8.50, 0);

        /*produto2.codProd = 0002;
        produto2.marca = "Iphone";
        produto2.modelo = "Iphone 8";
        produto2.desc = "Celular";
        produto2.preco = 2000.00;
        produto2.qntEmEstoque = 40;*/
        System.out.println(produto2.adicionarEstoque(50));
        produto2.retirarQntdEstoque(7);
        produto2.mostrarInformacoes();
        System.out.println(produto2.getcodProd());
        produto2.setcodProd(45395);
        System.out.println(produto2.getcodProd());
    }

}

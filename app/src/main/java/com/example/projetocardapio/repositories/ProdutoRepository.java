package com.example.projetocardapio.repositories;

import com.example.projetocardapio.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private List<Produto> listarProduto = new ArrayList<>();

    public void criarProduto(){

        // BURGUERS
        Produto produto = new Produto("Burguer Duplo", "Burguer", "G", 35.90 , " Pão Hamburguer, Dois Hamburguers, Maionese, queijo chedder, tomate e alface " );
        listarProduto.add(produto);

        produto = new Produto("Burguer Salada", "Burguer", "G", 30.90 , " Pão Hamburguer, Bife carne, Maionese, queijo Mussarela, tomate e alface " );
        listarProduto.add(produto);

        produto = new Produto("Burguer da Casa", "Burguer", "G", 35.90 , " Pão Hamburguer, Hamburguer Artesanal, Bacon, Maionese, queijo chedder, tomate e alface " );
        listarProduto.add(produto);

        produto = new Produto("Burguer Vegetariano", "Burguer", "G", 32.50 , " Pão Hamburguer, Hamburguer Soja, Maionese fit,  tomate e alface " );
        listarProduto.add(produto);

        produto = new Produto("Burguer Kids", "Burguer", "P", 20.50 , " Pão Hamburguer, escolher a Proteina , Queijo Chedder, Maionese,  tomate e alface " );
        listarProduto.add(produto);


        // BEBIDAS
        produto = new Produto("Refri Coca cola lata 350ml", "Bebida", "", 5.00 , "" );
        listarProduto.add(produto);

        produto = new Produto("Água com gás 500ml", "Bebida", "", 3.00 , "" );
        listarProduto.add(produto);

        produto = new Produto("Cerveja lata 473ml", "Bebida", "", 7.00 , "" );
        listarProduto.add(produto);

        produto = new Produto("H2O limoneto", "Bebida", "", 5.00 , "" );
        listarProduto.add(produto);


    }




}

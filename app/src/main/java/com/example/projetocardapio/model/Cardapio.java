package com.example.projetocardapio.model;

public class Cardapio {
    private int imgprod;
    private String descricao;
    private String categoria;
    private String valor;
    private String ingredientes;

    //contrutor
    public Cardapio(int imgprod, String descricao, String categoria, String valor, String ingredientes) {
        this.imgprod = imgprod;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    //getters e setters
    public int getImgprod() {
        return imgprod;
    }
    public void setImgprod(int imgprod) {
        this.imgprod = imgprod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}

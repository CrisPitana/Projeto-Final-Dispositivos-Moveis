package com.example.projetocardapio.models;

public class Produto {
    private String descricao;
    private String categoria;
    private String tamanho;
    private Double valor;
    private String ingredientes;

    public Produto(String descricao, String categoria, String tamanho, double valor, String ingredientes) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.valor = valor;
        this.ingredientes = ingredientes;
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}

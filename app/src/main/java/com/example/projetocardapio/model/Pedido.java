package com.example.projetocardapio.model;

public class Pedido {
    private Cardapio itemPedido;
    private Double subTotal;
    private Double valorFrete;
    private Double valorTotal;
    private String status;
    private String obsPedido;

    public Pedido(Cardapio itemPedido, Double subTotal, Double valorFrete, Double valorTotal, String status, String obsPedido) {
        this.itemPedido = itemPedido;
        this.subTotal = subTotal;
        this.valorFrete = valorFrete;
        this.valorTotal = valorTotal;
        this.status = status;
        this.obsPedido = obsPedido;
    }

    public Cardapio getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(Cardapio itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObsPedido() {
        return obsPedido;
    }

    public void setObsPedido(String obsPedido) {
        this.obsPedido = obsPedido;
    }
}

package com.dio.projetojava.model;

public class Produto {
    private Long id;
    private final String nome;
    private final Double preco;
    private final Integer quantidade;
    private final String categoria;

    public Produto(String nome, Double preco, Integer quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @Override
    public String toString() {
        return String.format("Produto{id=%d, nome='%s', R$%.2f, qtd=%d, cat='%s'}",
                id, nome, preco, quantidade, categoria);
    }
}

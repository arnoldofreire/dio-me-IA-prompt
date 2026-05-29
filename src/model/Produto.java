package com.dio.projetojava.model;

public class Produto {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String categoria;

    public Produto() {}

    public Produto(String nome, Double preco, Integer quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getValorTotalEstoque() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Produto{id=%d, nome='%s', R$%.2f, qtd=%d, cat='%s'}",
                id, nome, preco, quantidade, categoria);
    }
}
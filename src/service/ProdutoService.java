package com.dio.projetojava.service;

import com.dio.projetojava.model.Produto;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class ProdutoService {

    private final Map<Long, Produto> produtos = new HashMap<>();
    private final AtomicLong contadorId = new AtomicLong(1);

    public Produto salvar(Produto produto) {
        produto.setId(contadorId.getAndIncrement());
        produtos.put(produto.getId(), produto);
        return produto;
    }

    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos.values());
    }

    public Optional<Produto> buscarPorId(Long id) {
        return Optional.ofNullable(produtos.get(id));
    }

    public boolean deletar(Long id) {
        return produtos.remove(id) != null;
    }
}
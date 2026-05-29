package com.dio.projetojava;

import com.dio.projetojava.model.Produto;
import com.dio.projetojava.service.ProdutoService;
import com.dio.projetojava.util.CalculadoraUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PRODUTOS ===\n");

        ProdutoService service = new ProdutoService();

        Produto p1 = new Produto("Notebook", 3500.00, 10, "Eletrônicos");
        Produto p2 = new Produto("Mouse", 79.90, 25, "Periféricos");

        service.salvar(p1);
        service.salvar(p2);

        System.out.println("Produtos cadastrados:");
        service.listarTodos().forEach(System.out::println);

        System.out.println("\n=== CALCULADORA ===");
        System.out.println("10 + 5 = " + CalculadoraUtil.somar(10, 5));
        System.out.println("10 - 5 = " + CalculadoraUtil.subtrair(10, 5));
        System.out.println("10 * 5 = " + CalculadoraUtil.multiplicar(10, 5));
        System.out.println("10 / 5 = " + CalculadoraUtil.dividir(10, 5));
    }
}

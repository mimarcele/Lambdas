package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println (p.nome);

        Produto p1 = new Produto ("Lápis", 1.99, 0.12);
        imprimir.accept (p1);

        Produto p2 = new Produto ("Caneta", 8.99, 0.25);
        Produto p3 = new Produto ("Borracha", 3.59, 0.15);
        Produto p4 = new Produto ("Apontador", 4.99, 0.1);

        List<Produto> produtos = Arrays.asList (p1, p2, p3, p4);

        produtos.forEach (imprimir);
        produtos.forEach (p -> System.out.println (p.preco ));
        produtos.forEach (System.out::println);
    }
}

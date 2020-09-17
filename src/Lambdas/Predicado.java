package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> isCaro =
                produto -> produto.preco >= 1000;

        Produto prod = new Produto ("Notebook", 4459.89, 0.15);
        System.out.println (isCaro.test (prod) );
    }
}

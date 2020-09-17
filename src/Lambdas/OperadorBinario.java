package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double>  media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println (media.apply (5.8, 8.2) );

        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println (resultado.apply (8.5, 6.4) );

        Function<Double, String> conceito = m -> m >=7 ? "Aprovado" : "Reprovado";
        System.out.println (media.andThen (conceito).apply (7.2, 5.2) );
    }
}

package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0? "Par" : "Ímpar";

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        Function<String, String> exclamacao =
                valor -> valor + "!!";

        String resultadoFinal =
                parOuImpar.andThen (oResultadoE).andThen (exclamacao).apply (37865);

        System.out.println (parOuImpar.apply (37865) );
        System.out.println (resultadoFinal );
    }
}

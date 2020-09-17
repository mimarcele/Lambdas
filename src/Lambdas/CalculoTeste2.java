package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (x, y) -> { return x + y; };
        System.out.println (soma.executar (3,4) );

        Calculo multi = (z, w) -> { return z * w; };
        System.out.println (multi.executar (5, 3) );
    }
}

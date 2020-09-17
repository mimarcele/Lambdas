package Lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x,y) -> x+ y;
        System.out.println (calc.apply (4.0,3.0) );

        calc = (z,w) -> z * w;
        System.out.println (calc.apply (5.0,6.0) );


        BinaryOperator<Integer> calc2 = (a,b) -> a+ b;
        System.out.println (calc2.apply (2,7) );

        calc2 = (c,d) -> c * d;
        System.out.println (calc2.apply (8,7) );

    }




}

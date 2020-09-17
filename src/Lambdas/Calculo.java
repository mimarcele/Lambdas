package Lambdas;

@FunctionalInterface

//Interface funcional só pode ter um único método
public interface Calculo {

    public abstract double executar(double a, double b);
}
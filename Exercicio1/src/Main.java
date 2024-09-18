import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        float b;

        Scanner numero = new Scanner(System.in);
        a = numero.nextDouble();
        b = numero.nextFloat();

        double resultado = a*b;

        System.out.println((int)resultado);
    }
}
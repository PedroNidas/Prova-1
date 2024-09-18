import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Saída de dados com quebra de linha
        System.out.println("Hello world");


        //Saída de dados sem quebra de linha
        System.out.print("Hello world");
        System.out.println("Jonas");


        //Declaração de variáveis primitivas
        int x = 10;
        double z = 20.2;
        boolean teste = false;
        float y = 35.3f;

        //Declaração de variáveis não primitivas
        String nome = "Joao";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.lastIndexOf("a"));



        //Casting
        x = (int) z;
        System.out.println(x);

        //Promoção
        int v1 = 10;
        double h = v1;
        System.out.println(h);



        //Declarando scanner para entrada
        Scanner sc = new Scanner(System.in);
        //Variável que vai pegar o valor de entrada
        String nome2 = sc.next();
        //Saída do nome
        System.out.println(nome2);

        //Variável que vai pegar o valor de entrada
        int numero = sc.nextInt();
        System.out.println(numero);






    }

}

public class Arrays {

    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = {1,2,3};

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

        Carro[] carros = new Carro[2];

        Carro c1 = new Carro();
        c1.m1.cilindradas = 200;
        c1.ano = "2002";
        c1.modelo = "Ford Ka";
        c1.velocidadeMaxima = 160;


        carros[0] = c1;
        carros[1] = new Carro();
        System.out.println(carros[0].ano);
        x[0] = 1;

        System.out.println(x[0]);
        System.out.println(y[2]);


    }
}

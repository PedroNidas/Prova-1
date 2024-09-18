public class mainWhile {
    public static void main(String[] args) {
        //Exemplo de while com variável booleana
        boolean teste = true;
        int x = 10;

        while (teste){
            x -= 1;
            if (x == 0)
                teste = false;
            System.out.println(x);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("harry potter", 30, "fantasia");
        Livro l2 = new Livro("it a coisa", 200, "Terror");


        Cliente c1 = new Cliente("MARCOS", 30, 30);

        Biblioteca inatel = new Biblioteca("Inatel", "Bib Inatel");

        //COMO BIBLIOTECÁRIO SÓ EXISTE DENTRO DA BIBLIOTECA, PRECISO ACESSAR ELE ATRAVÉS DELA PARA MUDAR ATRIBUTOS
        inatel.getBibliotecario().setNome("Joao");
        inatel.getBibliotecario().setIdade(30);
        inatel.getBibliotecario().setDisponivel(true);

        //CRIANDO ATUOR
        Autor a1 = new Autor("RONALD MCDONALD", "Brasil");

        //Usando métodos

        
        //Autor escreve livro
        a1.escreverLivro(l2);

        //Inatel empresta livro (vai retornar falso nesse caso pq o livro ainda não foi adicionado, e débito>0)
        inatel.emprestarLivro(inatel.getBibliotecario(), c1, l1);
        //Pagar débito
        System.out.println(c1.pagarDebito(50));
        //Adicionar o livro l1
        inatel.addLivro(l1);

        //Emprestar o livro l1 (agora vai ser true, livro foi adicionado, e débito foi pago
        inatel.emprestarLivro(inatel.getBibliotecario(), c1, l1);
        //Adicionar o livro l2
        inatel.addLivro(l2);

        //Informações do livro l2
        System.out.println(l2.toString());
        //Informações do cliente c1
        System.out.println(c1.toString());
        //Informações da biblioteca
        System.out.println(inatel.toString());
        //Infomarções do bibliotecário
        System.out.println(inatel.getBibliotecario().toString());

        //Listar livros
        inatel.getBibliotecario().listarLivros(inatel);

    }

}

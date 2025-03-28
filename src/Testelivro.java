import java.util.Scanner;

public class Testelivro {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);


        Editor novatec = new Editor();
                novatec.nome = "Novatec";
                novatec.site = "www.novatec.com";
                novatec.telefone = "111559889";



        //criar um objeto -> instanciar um objeto
    // sintaxe: tipo nome do objeto = new Tipo();

        Livro meulivro = new Livro();
        meulivro.titulo = "ArloFich";
        meulivro.paginas = 400;
        meulivro.preco = 35;
        meulivro.resumo = "um menino se mudou para sua cidade natal...";
        meulivro.editor = "novatec";
        meulivro.tipoCapa = TipoCapaEnum.DURA ;
        meulivro.exibirLivro();

    Livro livro = new Livro();
        System.out.println("informe o titulo do livro");
        livro.titulo = leitor.nextLine();
        System.out.println("Tipo de capa \n1 - comum\n2 - dura\n3 - personalizada" +"\n Escolha o tipo de capa desejada: ");

        int opcao = leitorNumerico.nextInt();
        if(opcao == 1)
            livro.tipoCapa = TipoCapaEnum.COMUM;
        else if (opcao == 2)
            livro.tipoCapa = TipoCapaEnum.DURA;
        else livro.tipoCapa = TipoCapaEnum.PERSONALIZADA;

    }
}

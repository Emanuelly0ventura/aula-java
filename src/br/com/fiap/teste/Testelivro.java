package br.com.fiap.teste;

import br.com.fiap.enums.TipoCapaEnum;
import br.com.fiap.models.Editor;
import br.com.fiap.models.Livro;

import java.util.Scanner;

public class Testelivro {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);


        Editor novatec = new Editor();
                novatec.setNome("Novatec");
                novatec.setSite("www.novatec.com");
                novatec.setTelefone("111559889");



        //criar um objeto -> instanciar um objeto
    // sintaxe: tipo nome do objeto = new Tipo();

        Livro meulivro = new Livro();
        meulivro.setTitulo("ArloFich");
        meulivro.setPaginas(400);
        meulivro.setPreco(35);
        meulivro.setResumo("um menino se mudou para sua cidade natal...");
        meulivro.setEditor(novatec);
        meulivro.setTipoCapa(TipoCapaEnum.DURA);
        meulivro.exibirLivro();

    Livro livro = new Livro();
        System.out.println("informe o titulo do livro");
        livro.setTitulo(leitor.nextLine());
        System.out.println("Tipo de capa \n1 - comum\n2 - dura\n3 - personalizada" +"\n Escolha o tipo de capa desejada: ");

        int opcao = leitorNumerico.nextInt();
        if(opcao == 1)
            livro.setTipoCapa(TipoCapaEnum.COMUM);
        else if (opcao == 2)
            livro.setTipoCapa(TipoCapaEnum.DURA);
        else livro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

    }
}

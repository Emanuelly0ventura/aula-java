import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args){
        Scanner entrada1 = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ana";
        pessoa.altura = 1.65;
        pessoa.peso = 70;

        System.out.println("iMC = " + pessoa.calcularImc());
        System.out.println(pessoa.exibirClassificacao());

    }
}

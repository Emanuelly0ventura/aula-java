import java.util.Scanner;

public class TesteCandidato {
    public static void main (String[] args){


        Scanner escolha = new Scanner(System.in);

        int aceita;
        String negar;

        Candidato candidato = new Candidato();
            candidato.nome = "Roberto";
            candidato.sobreNome = "Barros";
            candidato.ensino = 0;
            candidato.idade = 19;
            candidato.altura = 1.80;


        System.out.println("Você quer fazer sua candidatura? [1] Sim ou [2] Não:");
        aceita = escolha.nextInt();
        int opcao = escolha.nextInt();


        System.out.println("Carregndo curriculo.....");
        System.out.println("Nome Completo: " + candidato.nomeCompleto() );
        System.out.println("Seu ensino: " + candidato.ensino);
        System.out.println("Idade: " + candidato.idade);
        System.out.println("Altura: " + candidato.altura);
        System.out.println(candidato.ensinoSuperior());

    }

}



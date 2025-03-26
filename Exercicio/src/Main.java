import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada1 = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
            funcionario.nome = "Roberto";
            funcionario.sobreNome = "Barros";
            funcionario.horasTrabalhadas = 180;
            funcionario.valorPorHora = 10;

        System.out.println("Salario: " + funcionario.calcularSalario());
        System.out.println("nome completo: " + funcionario.nomeCompleto());


    }
}

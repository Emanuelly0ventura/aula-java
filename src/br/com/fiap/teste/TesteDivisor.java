package br.com.fiap.teste;

import br.com.fiap.models.Divisor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteDivisor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try{
            Divisor divisor = new Divisor();
            System.out.println("Digite primeiro número: ");
            divisor.setNumero1(leitor.nextInt());

            System.out.println("Digite o segundo número: ");
            divisor.setNumero2(leitor.nextInt());

            divisor.calcular();
        }catch (ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        }catch (InputMismatchException e){
            System.out.println("Entrada errada Inválida, favor digitar um número");
        }catch (RuntimeException e){
            System.out.println("Erro inesperado!");
        }finally{
            System.out.println("Obrigada por utilizar nosso sistema!");
        }
    }
}

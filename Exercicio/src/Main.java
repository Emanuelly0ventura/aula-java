public class Main {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();
            funcionario.nome = "roberto";
            funcionario.sobreNome = "Barros";
            funcionario.horasTrabalhadas = 180;
            funcionario.valorPorHora = 10;

        System.out.println("Salario: " + funcionario.calculoDoSalario);


    }
}

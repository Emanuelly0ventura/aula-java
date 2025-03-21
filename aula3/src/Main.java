import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Funcionario funci = new Funcionario();
        funci.nome = "cecilia";
        funci.cargo = "Engenheira";
        funci.salario = 10.000;

        System.out.println("Bunus: " + funci.calculaerBonus());
        System.out.println("Gratificação: " + funci.calcularGratificacao());
        System.out.println("IRPF: " + funci.caulcularIRPF());
    }
}
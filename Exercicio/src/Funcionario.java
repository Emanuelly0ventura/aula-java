public class Funcionario {
    String nome;
    String sobreNome;
    int horasTrabalhadas;
    double valorPorHora;


    public double calcularSalario(){
            return (horasTrabalhadas * valorPorHora);}

    public String nomeCompleto(){
        return (nome + " " + sobreNome);}

    }




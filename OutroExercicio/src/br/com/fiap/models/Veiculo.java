package br.com.fiap.models;

public class Veiculo {

    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double doTotal(){
        return (valorAdicional + valorHora * (horas - 1));
    }

    public String doViewCupom() {
        return ("Cupom do estacionamento");
    }
}

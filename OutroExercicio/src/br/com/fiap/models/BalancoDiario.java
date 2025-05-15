package br.com.fiap.models;

public class BalancoDiario {

    private int qtdeCarros;
    private double total;

    //Polimorfismo -> veiculo (veiculo ou segurado)

    public void doAdd(Veiculo obj){
        qtdeCarros++;
        total += obj.doTotal();
    }


    public String doGerarRelatorio(){
        return "Relatorio diario";
    }

}

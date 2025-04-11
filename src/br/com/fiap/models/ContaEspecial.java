package br.com.fiap.models;

public class ContaEspecial extends ContaComun{

    private double limite;

    public Long abrirConta(int senha, double limite){
        this.limite = limite;
        return super.abrirConta(senha);
    }

    public String sacarValor(double valor){
        if(this.saldo+limite >= valor){
            this.saldo -= valor;
            return "Saque efetuado com sucesso";
        }

    }





}

package br.com.fiap.models;

import br.com.fiap.enums.SituacaoEnum;

import java.time.LocalDate;
import java.util.Random;

public class ContaComun {

    protected double valor;
    protected long nroConta;
    protected LocalDate dtAbertura;
    protected LocalDate dtEncerramento;
    protected SituacaoEnum situacao;
    protected int senha;
    protected double saldo;
    protected Cliente cliente;



    public Long abrirConta(int senha){
        Random random = new Random();
        this.nroConta = random.nextLong(1000);
        this.senha = senha;
        this.dtAbertura = LocalDate.now();
        this.situacao = SituacaoEnum.ATIVA;
        this.saldo = 100;
        return nroConta;
    }

    public boolean ValidarSenha(int senha){
        if(this.senha == senha){
            this.saldo += valor;
        }


        return true;
    }




}

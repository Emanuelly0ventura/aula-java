package br.com.fiap.models;

import br.com.fiap.interfaces.ISeguroService;

public class Segurado extends Veiculo implements ISeguroService {


    private double seguro;

    public double segurado(double seguro) {
        this.seguro = seguro;

    }

    public double doTotal(){
        return super.doTotal() - doDescconto;
    }

    @Override
    public double doDescconto(){
        return super.doTotal() * seguro/100;
    }

    public String doViewCupom(){

    }
}

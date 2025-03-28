public class Pessoa {
    String nome;
    double altura;
    double peso;

    public double calcularImc(){
        return (peso / (altura * altura));
    }

    public String exibirClassificacao() {
        if (calcularImc() < 18.5)
        {return ("Abaixo do peso");}

            else if (calcularImc() < 25)
        {return ("Peso normal");}

            else if (calcularImc() < 30)
        {return ("Acima do peso");}
            else if (calcularImc() < 35)
        {return ("Obesisdade I");}
            else if (calcularImc() < 40)
        {return ("Obesidade II");}
            else
        {return  ("obesidadeII");}


    }




}

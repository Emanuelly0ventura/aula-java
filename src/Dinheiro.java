public class Dinheiro {
    String nome;
    double  salario;
    int quantidadeAnos;

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome=nome;
        }
        //

    public double getSlario(){
        return salario;
    }

    public void setSalario(double salario){
           if(quantidadeAnos == 0)
            this.salario=salario;
    }else{
        this.salario = this.salario * 1.1;
    }
    //
    public int getQuantidadeAnos(){
        return quantidadeAnos;
    }

    public void setQuantidadeAnos(int quantidadeAnos){
        this.quantidadeAnos = quantidadeAnos;
        if (quantidadeAnos>0)
            setSalario(this.salario);
    }

    public String exibirFuncionario(){
        return "Nome: " + setNome();
    }

}

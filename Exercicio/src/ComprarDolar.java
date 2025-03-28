public class ComprarDolar {
    public static void main(String[] args){

        Moeda moeda = new Moeda();
        moeda.cotacaoDolar = 5.0;
        moeda.quantidadedDeDolar = 500;
        moeda.valorReal = 200;

        System.out.println("Seu dinheiro com cota: " + moeda.calculoConversao());

    }
}

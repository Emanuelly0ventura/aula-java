public class Livro {
    //atributo tipo namoAtributo;

    String titulo;

    String autor;

    double preco;

    String editor;

    int paginas;

    String resumo;

    TipoCapaEnum tipoCapa;

    public void exibirLivro(){
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editor: " + editor);
        System.out.println("Preço: " + preco);
        System.out.println("-------------------------------------\n");
        System.out.println("Tipo de capa: " + tipoCapa);
    }

    public String exibirTipoCapa() {
        return "";
    }
}

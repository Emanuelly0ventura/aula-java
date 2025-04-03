package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //atributo tipo namoAtributo;

    String titulo;

    String autor;

    double preco;

    String editor;

    int paginas;

    String resumo;

    TipoCapaEnum tipoCapa;


    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }
public Livro(Editor editor){
        this.editor = editor.toString();
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public void exibirLivro(){
        System.out.println("br.com.fiap.models.Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("br.com.fiap.models.Editor: " + editor);
        System.out.println("Preço: " + preco);
        System.out.println("-------------------------------------\n");
        System.out.println("Tipo de capa: " + tipoCapa);
    }

    public String exibirTipoCapa() {
        return "";
    }

}

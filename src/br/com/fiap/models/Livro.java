package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //atributo tipo namoAtributo;

    private String titulo;
    private String autor;
    private double preco;
    private Editor editor;
    private int paginas;
    private String resumo;
    TipoCapaEnum tipoCapa;


    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }
    public Livro(Editor editor){
        this.editor = editor;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor){
        this.editor=editor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
//
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }
//
    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){
        this.paginas=paginas;
    }
//
    public double getPreco(){
    return preco;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }
//
    public String getResumo(){
    return resumo;
    }

    public void setResumo(String resumo){
        this.resumo=resumo;
    }
//
    public TipoCapaEnum getTipoCapa(){
    return tipoCapa;
}

    public void setTipoCapa(TipoCapaEnum tipoCapa){
        this.tipoCapa=tipoCapa;
    }

    public void exibirLivro(){
        System.out.println("br.com.fiap.models.Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("br.com.fiap.models.Editor: " + getEditor().getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("-------------------------------------\n");
        System.out.println("Tipo de capa: " + getTipoCapa());
    }

    public String exibirTipoCapa() {
        return "";
    }

}

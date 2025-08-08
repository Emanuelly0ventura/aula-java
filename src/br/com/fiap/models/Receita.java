package br.com.fiap.models;

public class Receita {

    String nome;

    String cozinheira;

    String descricao;

    String dificuldade;

    int tempo;

    int pedacos;

    String preparo;

    String ingredientes;

    String foto;
// metodo sem retorno
    public void exibirReceita() {
        System.out.println("br.com.fiap.models.Receita de " + nome);
        System.out.println("===================");
        System.out.println("publicado por " + cozinheira);
        System.out.println(dificuldade + "\t" + tempo + "\t" + pedacos);
        System.out.println(descricao);
        System.out.println("Ingredientes\n" + ingredientes);
        System.out.println("Modo de Preparo\n" + preparo);
    }

// metodo com retorno
    public String exibirReceita2()
        {
            String menssagem = "br.com.fiap.models.Receita de" + nome +
                    "\n ===================" +
                    "\n publicado por \" + cozinheira" +
                    "\n dificuldade + \"\\t\" + tempo + \"\\t\" + pedacos" +
                    "\n descricao " +
                    "\n Ingredientes\\n\" + ingredientes" +
                    "\n Modo de Preparo\\n\" + preparo" +
                    "\n ===================" +
                    "\n publicado por \" + cozinheira" +
                    "\n dificuldade + \"\\t\" + tempo + \"\\t\" + pedacos" +
                    "\n descricao " +
                    "\n Ingredientes\\n\" + ingredientes"  +
                    "\n Modo de Preparo\\n\" + preparo";
            return menssagem;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCozinheira(String cozinheira) {
        this.cozinheira = cozinheira;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setPedacos(int pedacos) {
        this.pedacos = pedacos;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public String getCozinheira() {
        return cozinheira;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public int getTempo() {
        return tempo;
    }

    public int getPedacos() {
        return pedacos;
    }

    public String getPreparo() {
        return preparo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getFoto() {
        return foto;
    }
}


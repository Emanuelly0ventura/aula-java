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

}


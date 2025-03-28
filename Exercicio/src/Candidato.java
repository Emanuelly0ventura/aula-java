public class Candidato {
    private static final String EM = "EnsinoMedio - Cursando";
    private static final String ES = "EnsinoSuperior - Cursando";
    String nome;
        String sobreNome;
        double ensino;
        double idade;
        double altura;

    public String nomeCompleto() {
        return ( nome + " " + sobreNome);}

    public String ensinoSuperior(){
        if ( ensino == 1)
        {return ("Seu curriculo será avalidado, boa sorte!");}

        else if (ensino == 2)
        {return ("Seu curriculo será avalidado, boa sorte!");}

        else
        return "O estagio só será permitido caso esteja cursando um curso, favor alterar sua escolha.";
    }
}

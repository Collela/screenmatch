public class Filme {
    String nome;
    int anoDeLancamento, totalDeAvaliacoes, duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: "+ somaDasAvaliacoes);
    }

    void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
}

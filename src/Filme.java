public class Filme {
    String nome;
    int anoDeLancamento, totalDeAvaliacoes, duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

     void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}

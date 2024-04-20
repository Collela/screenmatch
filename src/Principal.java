public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Harry Potter";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.somaDasAvaliacoes = 5.5;

        meuFilme.exibeFichaTecnica();
    }
}

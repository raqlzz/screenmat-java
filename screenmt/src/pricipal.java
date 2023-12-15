import br.com.alura.screenmath.modelos.Filme;
import br.com.alura.screenmath.modelos.Serie;

public class pricipal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Homem aranha");
        meuFilme.setAnoDeLancamento(2022);

        meuFilme.ExibeFichaTecnica();
        meuFilme.avalia(4);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("A avaliação para este filme é; " + meuFilme.getSomaDasAvaliaçes());
        System.out.println("A quantidade se avaliações que este filme tem: " + meuFilme.getQuantidadeDeAvaliaçoe());

        Serie dark = new Serie();
        dark.setNome("dark");
        dark.setAnoDeLancamento(2020);
        dark.setTemporadas(4);
        dark.setEpisodiosPorTemporada(8);
        dark.setMinutosPorEpisódio(45);
        System.out.println("a duração em minutos é " + dark.getDuracãoEmMinutos());
    }
}

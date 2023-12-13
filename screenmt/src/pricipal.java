import br.com.alura.screenmath.modelos.Filme;

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

    }
}


package br.com.alura.screenmath.modelos;

public class Serie extends titulo {
private int  temporadas;
private boolean ativa;
private int episodiosPorTemporada;
private int minutosPorEpisódio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }


    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisódio() {
        return minutosPorEpisódio;
    }

    public void setMinutosPorEpisódio(int minutosPorEpisódio) {
        this.minutosPorEpisódio = minutosPorEpisódio;
    }

    @Override
    public int getDuracãoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisódio;
    }
}


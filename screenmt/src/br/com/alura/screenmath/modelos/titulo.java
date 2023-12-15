package br.com.alura.screenmath.modelos;

public class titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliaçes;
    private int quantidadeDeAvaliaçoe;
    private int DuracãoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getQuantidadeDeAvaliaçoe() {
        return quantidadeDeAvaliaçoe;
    }

    public double getSomaDasAvaliaçes() {
        return somaDasAvaliaçes;
    }

    public void ExibeFichaTecnica() {
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de laçamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliaçes = +nota;
        quantidadeDeAvaliaçoe++;
    }

    public int getDuracãoEmMinutos() {

package br.com.fiapride.model;

public class Alimentacao {
    private String nome;
    private double porcaoKg;

    public Alimentacao(String nome, double porcaoKg) {
        this.setNome(nome);
        this.setPorcaoKg(porcaoKg);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getPorcaoKg() {
        return porcaoKg;
    }

    public void setPorcaoKg(double porcaoKg) {
        this.porcaoKg = porcaoKg;
    }
}

package br.com.fiapride.model;

public class Formiga extends Animal{
    private boolean isRainha;

    public Formiga(String nome, int numeroPatas, boolean voa, Alimentacao alimentacao, boolean isRainha) {
        super(nome, numeroPatas, voa, alimentacao);
        this.isRainha = isRainha;
    }

    public boolean isRainha() {
        return this.isRainha;
    }

    public void setRainha(boolean rainha) {
        this.isRainha = rainha;
    }

    @Override
    public void emitirSom() {
        System.out.println("Pfffff (super som da formiga)!");
    }
}

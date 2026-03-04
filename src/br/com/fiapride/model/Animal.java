package br.com.fiapride.model;

public class Animal {
    private String nome;
    private int numeroPatas;
    private boolean voa;

    public String getNome() {
        return nome;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public boolean getVoa() {
        return voa;
    }

    public Animal(String nome, int numeroPatas, boolean voa) {
        this.nome = nome;
        this.numeroPatas = numeroPatas;
        this.voa = voa;
    }

    public void voar() {
        if(this.voa){
            System.out.println("Voando!!!");
        } else {
            System.out.println("Esse animal não consegue voar");
        }
    }

    public void renomear(String nome){
        this.nome = nome;
    }
}

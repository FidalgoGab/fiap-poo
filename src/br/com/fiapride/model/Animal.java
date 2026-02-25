package br.com.fiapride.model;

public class Animal {
    public String nome;
    public int numeroPatas;
    public boolean voa;

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

package br.com.fiapride.model;

public class Animal {
    private String nome;
    private int numeroPatas;
    private boolean voa;

    public Animal(String nome, int numeroPatas, boolean voa) {
        this.setNome(nome);
        this.setNumeroPatas(numeroPatas);
        this.setVoa(voa);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome.isEmpty()){
            System.out.println("Nome não pode ser vazio, informe um nome válido.");
            return;
        }
        this.nome = nome;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    private void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public boolean getVoa() {
        return voa;
    }

    private void setVoa(boolean voa) {
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
        this.setNome(nome);
    }
}

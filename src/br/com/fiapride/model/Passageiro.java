package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private double saldo;
    private String cpf;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0.0);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarSaldo(double valor){
        if(valor <= 0) {
            System.out.println("Erro o valor de recarga deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        if(custo <= 0) {
            System.out.println("Erro: custo da viagem é inválido.");
            return;
        }
        if(this.saldo < custo) {
            System.out.println("Erro saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }
}

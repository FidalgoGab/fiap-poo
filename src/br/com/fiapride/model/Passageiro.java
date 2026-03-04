package br.com.fiapride.model;

public class Passageiro {
    public String nome;
    public double saldo;
    public String cpf;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
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

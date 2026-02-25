package br.com.fiapride.main;

import br.com.fiapride.model.Animal;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
        // R: NÃO

        Animal animal1 = new Animal();
        animal1.nome = "Pet";
        animal1.numeroPatas = 4;
        animal1.voa = false;

        Animal animal2 = new Animal();
        animal2.nome = "Loro";
        animal2.numeroPatas = 2;
        animal2.voa = true;

        System.out.println("\n--- Sistema FiapRide (Animal) ---");
        System.out.println("Animal: " + animal1.nome + " | Patas: " + animal1.numeroPatas + " | Voa: " + (animal1.voa ? "Sim" : "Não"));
        System.out.println("Animal: " + animal2.nome + " | Patas: " + animal2.numeroPatas + " | Voa: " + (animal2.voa ? "Sim" : "Não"));

    }
}

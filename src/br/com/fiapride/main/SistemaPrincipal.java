package br.com.fiapride.main;

import br.com.fiapride.model.Animal;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        passageiro1.adicionarSaldo(50);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        passageiro2.adicionarSaldo(12.50);

        passageiro1.pagarViagem(40);
        passageiro2.pagarViagem(40);

        // Exibindo os dados no Console
        System.out.println("\n\n--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
        // R: NÃO

        Animal animal1 = new Animal("Pet", 4, false);
        Animal animal2 = new Animal("Loro", 2, true);

        System.out.println("\n--- Sistema FiapRide (Animal) ---");
        System.out.println("Animal1: " + animal1.getNome() + " | Patas: " + animal1.getNumeroPatas() + " | Voa: " + (animal1.getVoa() ? "Sim" : "Não"));
        System.out.println("Animal2: " + animal2.getNome() + " | Patas: " + animal2.getNumeroPatas() + " | Voa: " + (animal2.getVoa() ? "Sim" : "Não"));

        animal1.renomear("Mena");

        System.out.println("\nAnimal1: " + animal1.getNome() + " | Patas: " + animal1.getNumeroPatas() + " | Voa: " + (animal1.getVoa() ? "Sim" : "Não"));

        System.out.println("\nAnimal1 tenta voar");
        animal1.voar();
        System.out.println("\nAnimal2 tenta voar");
        animal2.voar();
    }
}

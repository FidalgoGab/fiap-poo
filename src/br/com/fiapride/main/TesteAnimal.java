package br.com.fiapride.main;

import br.com.fiapride.model.Alimentacao;
import br.com.fiapride.model.Animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Alimentacao alimentacao1 = new Alimentacao("Ração", 0.400);
        Alimentacao alimentacao2 = new Alimentacao("Alpiste", 0.150);

        Animal animal1 = new Animal("Pet", 4, false, alimentacao1);
        Animal animal2 = new Animal("Loro", 2, true, alimentacao2);

        System.out.println("\n--- Sistema FiapRide (Animal) ---");
        System.out.println("Animal1: " + animal1.getNome() + " | Patas: " + animal1.getNumeroPatas() + " | Voa: " + (animal1.getVoa() ? "Sim" : "Não") + " Alimentação: " + animal1.getAlimentacao());
        System.out.println("Animal2: " + animal2.getNome() + " | Patas: " + animal2.getNumeroPatas() + " | Voa: " + (animal2.getVoa() ? "Sim" : "Não") + " Alimentação: " + animal2.getAlimentacao());

        animal1.renomear("Mena");

        System.out.println("\nAnimal1: " + animal1.getNome() + " | Patas: " + animal1.getNumeroPatas() + " | Voa: " + (animal1.getVoa() ? "Sim" : "Não"));

        System.out.println("\nAnimal1 tenta voar");
        animal1.voar();
        System.out.println("\nAnimal2 tenta voar");
        animal2.voar();

        //Testando regra do setNome.
        //OBS: Como setNome é privado, vamos usar o metodo renomear() que internamente chama setNome().
        System.out.println("\n\nRenomeando animal sem valor (aspas vazias):");
        System.out.println("Nome antes de renomear: " + animal2.getNome());
        animal2.renomear("");
        System.out.println("Nome após renomear: " + animal2.getNome());
        System.out.println("\nRenomeando animal com valor:");
        System.out.println("Nome antes de renomear: " + animal2.getNome());
        animal2.renomear("Pitico");
        System.out.println("Nome após renomear: " + animal2.getNome());

        //Animal1 se alimenta
        animal1.alimentar(0.1);
        System.out.println("\n\nApós comer sobrou: " +animal1.getAlimentacao());
    }
}

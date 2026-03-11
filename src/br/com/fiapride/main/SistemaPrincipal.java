package br.com.fiapride.main;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // INSTANCIAÇÃO
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        passageiro1.adicionarSaldo(50);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        passageiro2.adicionarSaldo(12.50);
        passageiro1.pagarViagem(40);
        passageiro2.pagarViagem(40);

        // Exibindo os dados no Console
        System.out.println("\n\n--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$" + passageiro1.getSaldo());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$" + passageiro2.getSaldo());
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
        // R: NÃO
    }
}

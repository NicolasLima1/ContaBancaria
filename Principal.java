
import banco.Banco;
import java.util.Scanner;

/* Ponto de partida do programa*/
public class Principal {

    public static void main(String[] args) { // Entry point da app
        Scanner sc;
        Banco banco = new Banco();
        int opt = 0;

        do {
            System.out.println("***********************************************************");
            System.out.println("\n\n\n\n\n\n");
            System.out.println("***********************************************************");
            sc = new Scanner(System.in);
            System.out.println("Escolha uma opção:");
            System.out.println("1) Sair");
            System.out.println("2) Criar conta");
            System.out.println("3) Sacar");
            System.out.println("4) Depositar");
            System.out.println("5) Extrato");
            opt = sc.nextInt(); // obtém do usuário a opção

            if (opt == 2) { // CRIAR CONTA
                System.out.print("Digite o seu nome para a conta: ");
                sc = new Scanner(System.in); // detalhe técnico do java
                String nome = sc.nextLine();
                System.out.print("Digite o valor inicia de depósito da conta: ");
                sc = new Scanner(System.in); // detalhe técnico do java
                double valor = sc.nextDouble();
                banco.abrirConta(nome, valor);

            } else if (opt == 3) { // SACAR

                banco.sacar();
                
            } else if (opt == 4) { // DEPOSITAR

                banco.depositar();

            } else if (opt == 5) { // EXTRATO

                banco.extrato();
            }

        } while (opt != 1);

    }
}

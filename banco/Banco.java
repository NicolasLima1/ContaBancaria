package banco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {
     // atributos -----------------------------------------------------
    private ContaBancaria[] contas;
    private int numeroContas;
    
     // contrutores --------------------------------------------------
    public Banco(){
        
        contas = new ContaBancaria[10];
        numeroContas  = 0;
    }

    // metodos  -----------------------------------------------------
    public void sacar() {
        
        ContaBancaria ultimaContaCriada = contas[numeroContas-1];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = input.nextDouble();
        ultimaContaCriada.setSaldo(ultimaContaCriada.getSaldo() - valor);
        System.out.println("Seu Saldo atual é: " + ultimaContaCriada.getSaldo());
    }
    
    public void extrato(){

        ContaBancaria ultimaContaCriada = contas[numeroContas-1];
        System.out.println("DADOS DA CONTA");
        System.out.print("Nome titular: "+ultimaContaCriada.getNomeCliente());
        System.out.print("\nSaldo: "+ultimaContaCriada.getSaldo());
        System.out.print("\nNumero conta: "+ultimaContaCriada.getNumero());
        System.out.println("\nAgencia: "+ultimaContaCriada.getAgencia());
    }
    
    public void depositar(){
        
        ContaBancaria ultimaContaCriada = contas[numeroContas-1];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double valor = input.nextDouble();
        ultimaContaCriada.setSaldo(ultimaContaCriada.getSaldo() + valor);
        System.out.println("Seu Saldo atual é: " + ultimaContaCriada.getSaldo());
    }
    
    public boolean abrirConta(String nome, double valor){
        if(valor < 1000){
            System.out.println("Não é possível criar a conta com menos de R$ 1000,00");
            return false;
        }
        Random rand = new Random();
        int numeroConta = rand.nextInt(899999) + 100000; // gerar um valor aleatório (10000 - 99999)
        int numeroAgencia = rand.nextInt(8999) + 1000; // gerar um valor aleatório (1000 - 9999)
        ContaBancaria novaConta = new ContaBancaria(numeroConta,numeroAgencia,valor,nome,400.00);
        contas[numeroContas] = novaConta;
        numeroContas++;
        // implementação
        return true;
    }
    
}

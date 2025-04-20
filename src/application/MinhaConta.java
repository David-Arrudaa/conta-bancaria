package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class MinhaConta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1;

        System.out.print("Enter com o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Entre com seu nome: ");
        sc.nextLine(); // Limpar o buffer de entrada
        String nomeTitular = sc.nextLine();
        System.out.print("Deseja fazer um deposito inicial? (s/n) ");
        char op = sc.next().charAt(0);


        if (op == 's') {
            System.out.print("Entre com o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta1 = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
        } else {
            conta1 = new ContaBancaria(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Conta atualizada:");
        System.out.println(conta1);

        System.out.println();
        System.out.print("Entre com o valor a ser depositado: ");
        double valorDeposito = sc.nextDouble();
        conta1.depositoConta(valorDeposito);
        System.out.println("Conta atualizada:");
        System.out.println(conta1);

        System.out.println();
        System.out.print("Entre com o valor a sacar da conta: ");
        double saqueConta = sc.nextDouble();
        conta1.saqueConta(saqueConta);
        System.out.println("Conta atualizada:");
        System.out.println(conta1);

        sc.close();
    }

}

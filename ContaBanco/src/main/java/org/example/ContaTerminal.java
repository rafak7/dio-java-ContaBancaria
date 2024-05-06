package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args) {

        System.out.println("Por favor, digite o número da Agência!");
        Scanner sc = new Scanner(System.in);
        int agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o Nome Do Cliente!");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o Valor do Deposito!");
        Double valDeposito = sc.nextDouble();


        System.out.println("Ola, "+ nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + " conta " + numeroConta +
                " e seu saldo " + valDeposito + " já está disponível para saque.");

        sc.close();
    }


}

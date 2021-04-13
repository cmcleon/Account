package src;

import java.util.Scanner;

//entrada e saida de numeros com objetos Account;
public class AccountTest {
	public static void main (String[] args) { //metodo main inicia a execuação do app Java
		Account account1 = new Account(50.00); // cria objeto Account
		Account account2 = new Account(-7.53); // cria objeto Account
		
		//exibe o saldo inicial de cada objeto
		System.out.printf("account1 balance: $%.2f ", account1.getBalance() );
		System.out.println();
		System.out.printf("account2 balance: $%.2f ", account2.getBalance() );
		
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		double depositAmount;// quantia de deposito lida a aprtir do usuario
		
		System.out.println(); System.out.println();
		
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("Adding $%.2f to account1 balance", depositAmount );
		account1.credit(depositAmount); //add o saldo de account1
		System.out.println();
		
		//exibe os saldos
		System.out.println();
		System.out.printf("account1 balance: $%.2f", account1.getBalance());
		System.out.println();
		System.out.printf("account2 balance: $%.2f", account2.getBalance());
		
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("Adding $%.2f to account2 balance", depositAmount );
		account2.credit(depositAmount); //add o saldo de account1
		System.out.println();
				
		//exibe os saldos
		System.out.println();
		System.out.printf("account1 balance: $%.2f", account1.getBalance());
		System.out.println();
		System.out.printf("account2 balance: $%.2f", account2.getBalance());
	}

}

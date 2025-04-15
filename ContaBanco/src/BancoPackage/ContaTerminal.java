package BancoPackage;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	
	public static void main (String[] args) throws Exception{
Scanner scanner=new Scanner(System.in);		
int Conta,Agencia;
String Nome;
double Saldo;

	System.out.print("\nBem vindo ao terminal do banco !!");
	System.out.print("\nDigite seu nome: ");
	 	Nome=scanner.nextLine();
	System.out.print("\nDigite o numero da conta : ");
	  	Conta=scanner.nextInt();
	System.out.print("\nDigite o numero da agência: ");
	  	Agencia=scanner.nextInt();
	System.out.printf("\nSr(a): %s%nConta e agencia: %d%n - %d%n",Nome,Conta,Agencia);
	System.out.print("\nDeposite um valor:  ");
	  	Saldo=scanner.nextDouble();
	System.out.printf("\nOlá %s , obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo R$%.2f já está disponível para saque.",Nome,Agencia,Conta,Saldo);
	  	scanner.close();
	  
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
		

}

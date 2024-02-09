package com.ruan.cursojava.testeteclado;

import java.util.Scanner;

public class Leituradadosteclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Digite seu nome inteiro: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é : " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Digite seu primeiro nome: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de pessoas que moram com você, salario e se tem animal de estimação");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdmoram = scan.nextByte();
		double salario =scan.nextDouble();
		boolean tempet = scan.nextBoolean();
		
		System.out.println("Você digitou os sequintes valores: ");
		
 
		
		
		
		
		
	}

}

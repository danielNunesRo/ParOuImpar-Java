package main;

import java.util.Scanner;

import entities.Methods;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option = null;
		
		Methods parOuImpar = new Methods();
		parOuImpar.saudacao();
		do {
			System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            String paridade = parOuImpar.verificarParidade(num);

            System.out.println("O número " + num + " é " + paridade);
            sc.nextLine();
            System.out.println("Deseja fazer um novo teste ?");
            option = sc.nextLine();
		} while (option.equalsIgnoreCase("Sim"));
			
		
		
		
        
        
	}

}

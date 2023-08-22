package entities;

import java.util.Scanner;

public class Methods {
	
	private Scanner scanner;

    public Methods() {
        scanner = new Scanner(System.in);
    }
    
    public String verificarParidade(int num) {

        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public void saudacao(){
        System.out.println("Bem-vindo ao teste de paridade!");
    }

    public void despedida(){
        System.out.println("Obrigado por utilizar o teste de paridade!");
    }
	
	
}

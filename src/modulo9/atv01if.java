package modulo9;

import java.util.Scanner;

public class atv01if {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o número A: ");
	        int A = scanner.nextInt();

	        System.out.print("Digite o número B: ");
	        int B = scanner.nextInt();

	        System.out.print("Digite o número C: ");
	        int C = scanner.nextInt();

	        int soma = B + A;

	        System.out.print(B + " + " + A + " = " + soma);

	        if (soma > C) {
	            System.out.println(" > " + C);
	            System.out.println("A Soma de A + B é Maior do que C");
	        } else if (soma < C) {
	            System.out.println(" < " + C);
	            System.out.println("A Soma de A + B é Menor do que C");
	        } else {
	            System.out.println(" = " + C);
	            System.out.println("A Soma de A + B é Igual a C");
	        } 
	        scanner.close();
	    }
	}
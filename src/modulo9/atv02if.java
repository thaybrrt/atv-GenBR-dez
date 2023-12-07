package modulo9;

import java.util.Scanner;

	public class atv02if {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero % 2 == 0) {
	            System.out.print("O Número " + numero + " é par ");
	        } else {
	            System.out.print("O Número " + numero + " é ímpar ");
	        }
	        if (numero > 0) {
	            System.out.println("e positivo!");
	        } else if (numero < 0) {
	            System.out.println("e negativo!");
	        } else {
	            System.out.println("e zero!");
	        }
	        scanner.close();
	    }
	}

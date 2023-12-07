package modulo9;

import java.util.Scanner;

public class atv07switch {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o 1º número: ");
	        float numero1 = scanner.nextFloat();

	        System.out.print("Digite o 2º número: ");
	        float numero2 = scanner.nextFloat();

	        System.out.print("Operação (Código de 1 a 4): ");
	        int codigoOperacao = scanner.nextInt();

	        switch (codigoOperacao) {
	            case 1:
	                System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
	                break;
	            case 2:
	                System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
	                break;
	            case 3:
	                System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
	                break;
	            case 4:
	                if (numero2 != 0) {
	                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
	                } else {
	                    System.out.println("Erro: Divisão por zero.");
	                }
	                break;
	            default:
	                System.out.println("Operação Inválida!");
	        }
	        scanner.close();
	    }
	}

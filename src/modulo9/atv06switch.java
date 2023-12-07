package modulo9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atv06switch {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nome do colaborador: ");
	        String nome = scanner.nextLine();

	        System.out.print("Cargo: ");
	        int codigoCargo = scanner.nextInt();

	        System.out.print("Salário: R$ ");
	        float salario = scanner.nextFloat();

	        String cargo = determinarCargo(codigoCargo);
	        float percentualReajuste = determinarPercentualReajuste(codigoCargo);

	        float novoSalario = salario + (percentualReajuste * salario);

	        DecimalFormat formatoSalario = new DecimalFormat("0.00");

	        System.out.println("\nNome do colaborador: " + nome);
	        System.out.println("Cargo: " + cargo);
	        System.out.println("Novo Salário: R$ " + formatoSalario.format(novoSalario));

	        scanner.close();
	    }

	    private static String determinarCargo(int codigoCargo) {
	        String cargo;

	        switch (codigoCargo) {
	            case 1:
	                cargo = "Gerente";
	                break;
	            case 2:
	                cargo = "Vendedor";
	                break;
	            case 3:
	                cargo = "Supervisor";
	                break;
	            case 4:
	                cargo = "Motorista";
	                break;
	            case 5:
	                cargo = "Estoquista";
	                break;
	            case 6:
	                cargo = "Técnico de TI";
	                break;
	            default:
	                cargo = "Cargo não especificado";
	        }

	        return cargo;
	    }

	    private static float determinarPercentualReajuste(int codigoCargo) {
	        float percentualReajuste;

	        switch (codigoCargo) {
	            case 1:
	                percentualReajuste = 0.10f;
	                break;
	            case 2:
	                percentualReajuste = 0.07f;
	                break;
	            case 3:
	                percentualReajuste = 0.09f;
	                break;
	            case 4:
	                percentualReajuste = 0.06f;
	                break;
	            case 5:
	                percentualReajuste = 0.05f;
	                break;
	            case 6:
	                percentualReajuste = 0.08f;
	                break;
	            default:
	                percentualReajuste = 0.0f;
	        }

	        return percentualReajuste;
	    }
	}

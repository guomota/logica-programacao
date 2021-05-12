package estrutura.sequencial;

import java.util.Scanner;

/**
 * Classe responsável por calcular reajuste de salário
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 *
 */
public class ReajusteSalario {
	
	private static Scanner scanner;
	
	/**
	 * Método responsável por receber o valor do salário 
	 * e implimir o salario com 15% de reajuste
	 * 
	 * @param {@code String[]} - args
	 */
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário:");
		double salario = scanner.nextDouble();
		System.out.println("Seu novo salario é " + (salario * 1.15));
	}
}

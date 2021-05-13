package diversos;

import java.util.Scanner;

/**
 * Classe responsável por realizar o calculo do fatorial
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 *
 */
public class Fatorial {
	
	private static Scanner scanner;
	
	/**
	 * Método responsável por receber o número
	 * 
	 * @param {@code String[]} - args
	 */
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Digite um número e obtenha seu fatorial: ");
		int num = scanner.nextInt();
		System.out.println("O fatorial de " + num + " é " + calculaFatorial(num));
	}

	/**
	 * Método responsável por realizar o calculo do fatorial
	 * 
	 * @param {@code int} - número a ser calculado o fatorial
	 * 
	 * @return {@ int} - fatorial 
	 */
	private static Long calculaFatorial(int num) {
		
		Long fatorial = 1L;

		for(;num > 1; num--) {
			fatorial *= num;
		}
		
		return fatorial;
		
	}
}

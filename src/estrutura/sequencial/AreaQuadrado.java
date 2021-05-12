package estrutura.sequencial;

import java.util.Scanner;

/**
 * Classe responsável por calcular a área de um quadrado
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 *
 */
public class AreaQuadrado {
	
	private static Scanner scanner;
	
	/**
	 * Método responsável por receber a medida do lado do quadrado e imprimir
	 * o valor de sua área no console
	 * 
	 * @param {@code String[]} - args
	 */
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado do quadrado:");
		int medidaLado = scanner.nextInt();
		System.out.println("A área do quadrado é " + (medidaLado * medidaLado));
	}
}

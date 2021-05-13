package estrutura.sequencial;

import java.util.Scanner;

/**
 * Classe responsável por calcular a área de um triangulo retangulo
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 *
 */
public class AreaTriangulo {
	
	private static Scanner scanner;
	
	/**
	 * Método responsável por receber as medidas do triangulo e 
	 * imprimir o valor da área
	 * 
	 * @param {@code String[]} - args
	 */
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Digite a medida da base do triangulo:");
		int base = scanner.nextInt();
		System.out.println("Digite a medida da altura do triangulo:");
		int altura = scanner.nextInt();
		
		System.out.println("A área do triangulo é " + ((base * altura)/2));	
	}
}

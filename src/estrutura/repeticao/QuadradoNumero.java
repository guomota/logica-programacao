package estrutura.repeticao;

/**
 * Classe responsável por calcular o quadrado dos valores entre 10 e 150, inclusive
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 *
 */
public class QuadradoNumero {
	
	/**
	 * Método responsável por calcular o quadrado dos valores entre 
	 * 10 e 150, inclusive, e imprimir no console
	 * 
	 * @param {@code String[]} - args
	 */
	public static void main(String[] args) {
		
		for(int num = 10; num < 151; num++) {
			
			System.out.println(num + "ˆ2 = " + (num * num));
			
		}
	}
}

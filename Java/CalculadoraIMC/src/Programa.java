
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculadora pessoa = new Calculadora();
		
		System.out.println("Digite a sua altura(cm): ");
		pessoa.setAltura(sc.nextDouble());
		
		System.out.println("Digite a sua peso (kg): ");
		pessoa.setPeso(sc.nextDouble());
		
		System.out.printf("\nA sua altura � igual: %.2f m", pessoa.getAltura());
		System.out.printf("\nO seu peso � igual: %.2f kg", pessoa.getPeso());
		System.out.printf("\nO seu imc � igual: %.2f", pessoa.imc());
		System.out.printf("\nA sua classifica��o: %s", pessoa.nivel());
		
		sc.close();
		
	}
	
}
import java.util.Scanner;
import java.util.Locale;
public class lista2exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leTeclado = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero1 = leTeclado.nextInt();
		System.out.println("Digite outro número");
		int numero2 = leTeclado.nextInt();
		System.out.println("Digite mais um número");
		int numero3 = leTeclado.nextInt();
		
		if(numero1 >numero2 && numero2>numero3) {
			System.out.println("A sequência em ordem decrescente é a seguinte: " + numero1 + "," + numero2 + "," + numero3);
			}else if(numero1>numero3 && numero3>numero2) {
				System.out.println("A sequência em ordem decrescente é a seguinte: " + numero1 + "," + numero3 + "," + numero2);
			}else if(numero2>numero1 && numero1>numero3) {
				System.out.println("A sequência em ordem decrescente é a seguinte: " + numero2 + "," + numero1 + "," + numero3);
			}else if(numero2>numero3 && numero3>numero1) {
				System.out.println("A sequência em ordem decrescente é a seguinte: " + numero2 + "," + numero3 + "," + numero1);
			}else if(numero3>numero1 && numero1>numero2) {
				System.out.println("A sequência em ordem decrescente é a seguinte: " + numero3 + "," + numero1 + "," + numero2);
			}else {
				System.out.println("A sequência em ordem decrescente é a seguinte: " + numero3 + "," + numero2 + "," + numero1);
			}
		
		}

}
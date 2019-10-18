import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int opcao = 0;
		do {
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");
			
			System.out.println("Escolha uma opção");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Somar");
					System.out.println("Digite o primeiro número");
					double numero1 = sc.nextDouble();
					System.out.println("Digite o segundo número");
					double numero2 = sc.nextDouble();
					double total = numero1 + numero2;
					System.out.println("O valor da soma é: " + total);
			} else if (opcao == 2) {
				System.out.println("Subtrair");
				System.out.println("Digite o primeiro número");
				double numero1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				double numero2 = sc.nextDouble();
				double total = numero1 - numero2;
				System.out.println("O valor da subtração é: " + total);
			} else if (opcao == 3) {
				System.out.println("Multiplicar");
				System.out.println("Digite o primeiro número");
				double numero1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				double numero2 = sc.nextDouble();
				double total = numero1 * numero2;
				System.out.println("O valor da multiplicação é: " + total);
			} else if (opcao == 4) {
				System.out.println("Dividir");
				System.out.println("Digite o primeiro número");
				double numero1 = sc.nextDouble();
				System.out.println("Digite o segundo número");
				double numero2 = sc.nextDouble();
				double total = numero1 / numero2;
				System.out.println("O valor da divisão é: " + total);
			}
			
			
		} while (opcao != 5);
			System.out.println("Bye-bye");
		
		
		}
		
	}



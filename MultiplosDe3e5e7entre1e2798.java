import java.util.Scanner;
public class lista2exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		while(contador<=2798) {
			if(contador % 3 == 0 && contador % 5 == 0 && contador % 7 == 0)
		System.out.println(contador);
		contador++;
		
		} 	
	}
}

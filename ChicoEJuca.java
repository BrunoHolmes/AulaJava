
public class lista2exercicio11 {

	public static void main(String[] args) {
		final double CRESCIMENTO_POR_ANO_CHICO = 0.2;
		final double CRESCIMENTO_POR_ANO_JUCA = 0.1;
		
		double chico = 1.10;
		double juca = 1.20;
		
		int contador = 0;
			do {
				chico = chico + CRESCIMENTO_POR_ANO_CHICO;
				juca = juca + CRESCIMENTO_POR_ANO_JUCA;
				contador++;}
			
			while(chico<=juca); 
				
				System.out.println("Chico agora é maior que Juca, sua altura é: " + chico + ", enquanto a de Juca é: " + juca );
				System.out.println("Foram necessários " + contador + " anos para ele ultrapassá-lo.");
	}
}

import java.util.Scanner;
public class CadastroDeDadosDosFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TOTAL_FUNCIONARIOS = 100;
		double meta = 0;
		double faturamento = 0;
		int novoTempoDeEmpresa;
		int opcao;
		String continuar;
		int quantidadeDeFuncionarios = 0;
		String[] nomeDoFuncionario =  new String[TOTAL_FUNCIONARIOS];
		int[] tempoDeEmpresa = new int[TOTAL_FUNCIONARIOS];
		int[] idadeDoFuncionario =  new int[TOTAL_FUNCIONARIOS];
		double[] salarioDoFuncionario = new double[TOTAL_FUNCIONARIOS];
		String procurandoFuncionario; 
		
		
		
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1) Cadastrar funcionário");
			System.out.println("2) Alterar tempo de empresa");
			System.out.println("3) Cadastrar meta da empresa");
			System.out.println("4) Cadastrar faturamento da empresa e bônus aos funcionários");
			System.out.println("5) Listagem e dados dos funcionários");
			System.out.println("6) Sair");
			opcao = sc.nextInt();
			
			if(opcao < 1 || opcao > 6) {
				System.out.println("Opção inválida, por favor tente novamente");
			}
			
			if(opcao == 1) {
				for(int i = 0; i < TOTAL_FUNCIONARIOS; i++) {
				System.out.println("Digite o nome do funcionário:");
				nomeDoFuncionario[i]= sc.next().toUpperCase();
				System.out.println("Digite o tempo de empresa (EM ANOS):");
				tempoDeEmpresa[i] = sc.nextInt();
				System.out.println("Digite a idade:");
				idadeDoFuncionario[i] = sc.nextInt();
				System.out.println("Digite o salário:");
				salarioDoFuncionario[i] = sc.nextDouble();
				quantidadeDeFuncionarios++;
				System.out.println("Deseja continuar cadastrando algum funcionário? [s/n]");
				continuar = sc.next();
				
				if(continuar.toLowerCase().equals("s")) {
					continue;
				} else if(continuar.toLowerCase().equals("n")){
					System.out.println("Fim do cadastro");
					break;
				}else {
					System.out.println("Opção inválida. Por favor, tente novamente");
					break;
					} 
				}
			}
			
			else if(opcao == 2) {
				for(int i = 0; i < nomeDoFuncionario.length; i++) {
					System.out.println("Deseja alterar o tempo de empresa de qual funcionário?");
					procurandoFuncionario = sc.next();
					if(procurandoFuncionario.toUpperCase().equals(nomeDoFuncionario[i])) {
					System.out.println("Funcionário encontrado. Atualize o tempo de empresa dele(a):");
					novoTempoDeEmpresa = sc.nextInt();
					if(novoTempoDeEmpresa != tempoDeEmpresa[i]) {
						tempoDeEmpresa[i] = novoTempoDeEmpresa;
						System.out.println("Dados atualizados!");
						break;
					} else if(novoTempoDeEmpresa == tempoDeEmpresa[i]) {
						System.out.println("Dados idênticos. Tente novamente.");
						break;
					}
				} else {
					System.out.println("Funcionário não encontrado");
					break;
				}
				}	
			}
			else if(opcao == 3) {
				System.out.println("Digite a meta da empresa para o mês corrente:");
				meta = sc.nextDouble();
				System.out.println("Meta cadastrada com sucesso!");
			}
			else if(opcao == 4) {
				System.out.println("Digite o faturamento do mês: ");
				faturamento = sc.nextDouble();
				System.out.println("Faturamento cadastrado com sucesso!");
				if(faturamento > meta) {
					double excedente = faturamento - meta;
					double bonus = excedente/quantidadeDeFuncionarios;
					System.out.println("Cada funcionário terá direito a " + bonus + "R$ de bônus.");
					System.out.println("Funcionários com mais de 10 anos de empresa terão direito a: " + (bonus * 1.02) + "R$.");
				}
			}
			else if(opcao == 5) {
				System.out.println("Há " + quantidadeDeFuncionarios + " empregados cadastrados.");
				for(int i = 0; i < nomeDoFuncionario.length; i++) {
				System.out.println("Digite o nome do funcionário:");
				procurandoFuncionario = sc.next();
				if(procurandoFuncionario.toUpperCase().equals(nomeDoFuncionario[i])) {
					System.out.println("Funcionário encontrado. Seguem os dados sobre ele(a):");
					System.out.println("Nome: " + nomeDoFuncionario[i] + ". Idade: " + idadeDoFuncionario[i] + ", tempo de empresa: " + tempoDeEmpresa[i] + ", salário: " + salarioDoFuncionario[i]);
					System.out.println("Deseja visualizar os dados de outros funcionários?[s/n]");
					continuar = sc.next();
					if(continuar.toLowerCase().equals("s")) {
						continue;
					}else if(continuar.toLowerCase().equals("n")) {
						System.out.println("Fim.");
						break;
					}
				}else {
					System.out.println("Funcionário não encontrado. Tente novamente");
					break;
				}
			}
			}
			
		}while(opcao != 6);
		System.out.println("Até mais!");	
	}	
}
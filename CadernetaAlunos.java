import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	  final int TOTAL_NUMEROS = 3;  
	  
	  //variavel para capturar informações do teclado
	  Scanner leiaValores = new Scanner(System.in);
	  
	  //vetores para salvar as notas e medias
	  double[] notas1 = new double[TOTAL_NUMEROS];
	  double[] notas2 = new double[TOTAL_NUMEROS];
	  double[] medias = new double[TOTAL_NUMEROS];
	  
	  //vetor para salvar o nome do aluno
	  String[] nomeAluno = new String[TOTAL_NUMEROS];
      
      double maiorMedia = -1;
      double menorMedia = 11;
      
      String alunoMaior=null;
      String alunoMenor=null;
      
      int quantidadeAlunosAprovados = 0;
      int quantidadeAlunosFinal = 0;
      int quantidadeAlunosReprovados = 0;
      
      for (int i=0; i < TOTAL_NUMEROS; i++){
          //le o nome do aluno
          System.out.println("Digite o nome do aluno da posição " + i);
          nomeAluno[i] = leiaValores.next();
          
          //le a nota 1 do aluno
          System.out.println("Digite a nota 1 de " + nomeAluno[i]);
          notas1[i] = leiaValores.nextDouble();
          
          //le a nota 2 do aluno
          System.out.println("Digite a nota 2 de " + nomeAluno[i]);
          notas2[i] = leiaValores.nextDouble();
          
          //calcula a media do aluno
          medias[i] = (notas1[i] + notas2[i]) / 2;
          
          if(medias[i] >= 7){
              quantidadeAlunosAprovados++;
          }else if(medias[i] >= 4){
              quantidadeAlunosFinal++;
          }else{
              quantidadeAlunosReprovados++;
          }
          
          //verifica se a media do aluno que esta sendo cadastrado
          //e a maior media
          if(medias[i] > maiorMedia){
              maiorMedia = medias[i];
              alunoMaior = nomeAluno[i];
          }
          
          //verifica se a media do aluno que esta sendo cadastrado
          //e a menor media
          if(medias[i] < menorMedia){
              menorMedia = medias[i];
              alunoMenor = nomeAluno[i];
          }
      }
      
      for (int i=0; i < TOTAL_NUMEROS; i++){
        System.out.println("Aluno : " + nomeAluno[i] 
                + "\n nota1-> " + notas1[i] 
                + "\n nota2-> " + notas2[i]
                + "\n media-> " + medias[i]);
        System.out.println("--------------------------------");  
      }
      
      System.out.println("Total alunos aprovados: " + quantidadeAlunosAprovados);
      System.out.println("Total alunos final: " + quantidadeAlunosFinal);
      System.out.println("Total alunos reprovados: " + quantidadeAlunosReprovados);
      
      //escreve na tela a maior media e nome do aluno 
      System.out.println("A maior média foi: " + maiorMedia + " de: " + alunoMaior);
      System.out.println("A menor média foi: " + menorMedia + " de: " + alunoMenor);
     
	}
}
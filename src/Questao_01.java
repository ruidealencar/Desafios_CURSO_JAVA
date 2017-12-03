import java.util.Scanner;

public class Questao_01 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double media,nota1,nota2;

		System.out.println("Digite a 1º nota do aluno:");
		nota1 = scan.nextDouble();
		System.out.println("Digite a 2º nota do aluno:");
		nota2 = scan.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media>=7.0) {
			System.out.println("O aluno(a) foi APROVADO com média: "+media);	
		}else{
			System.out.println("O aluno(a) foi REPROVADO com média: "+media);
		}
		
		scan.close();
	}

}

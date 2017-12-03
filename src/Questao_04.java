import java.util.Scanner;

public class Questao_04 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String aluno;
		double nota1,nota2,media;
		System.out.println("Digite o nome do aluno(a):");
		aluno = scan.nextLine();
		System.out.println("Digite a 1ª nota do aluno(a): "+aluno);
		nota1 = scan.nextDouble();
		System.out.println("Digite a 2ª nota do aluno(a): "+aluno);
		nota2 = scan.nextDouble();
		media = (nota1+nota2)/2;
		if (media<5.0) {
			System.out.println("O aluno(a): "+aluno+" obteve média Inferior a 5,0 - REPROVADO");
		}else if (media>5.0 && media <7.0) {
			System.out.println("O aluno(a): "+aluno+" obteve média De 5,1 a 6,9 - RECUPERAÇÃO");
		}else if (media>7.0 && media<=10.0) {
			System.out.println("O aluno(a): "+aluno+" obteve média De 7,0 a 10 - APROVADO");
		}
		scan.close();
	}

}

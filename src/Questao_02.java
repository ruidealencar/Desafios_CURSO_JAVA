import java.util.Scanner;
public class Questao_02 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois numeros que lhe direi o maior deles ou se s�o iguais");
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		
		if (numero1==numero2) {
			System.out.println("S�o Iguais");
		}else if (numero1>numero2) {
			System.out.println("O 1� n�mero � maior que o 2� n�mero");
		}else{
			System.out.println("O 2� n�mero � maior que o 1� n�mero");
		}
		scan.close();
	}

}

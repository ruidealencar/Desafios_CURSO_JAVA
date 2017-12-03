import java.util.Scanner;
public class Questao_02 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois numeros que lhe direi o maior deles ou se são iguais");
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		
		if (numero1==numero2) {
			System.out.println("São Iguais");
		}else if (numero1>numero2) {
			System.out.println("O 1º número é maior que o 2º número");
		}else{
			System.out.println("O 2º número é maior que o 1º número");
		}
		scan.close();
	}

}

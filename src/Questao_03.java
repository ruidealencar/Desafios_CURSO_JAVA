import java.util.Scanner;
public class Questao_03 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Digite tr�s n�meros que direi o maior dos 3:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		if (num1>num2 && num2>num3) {
			System.out.println("O Maior foi o 1�");		
		}else if (num2>num1 && num2>num3) {
			System.out.println("O Maior foi o 2�");
		}else{
			System.out.println("O Maior foi o 3�");
		}
		scan.close();
	}

}

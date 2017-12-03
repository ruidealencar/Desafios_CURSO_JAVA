import java.util.Scanner;

public class Questao_05 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade:");
		idade = scan.nextInt();
	
		if (idade>=10 && idade<=14) {
			System.out.println("10-14 infantil");
		}else if (idade>=15 && idade<=17) {
			System.out.println("15-17 juvenil");
		}else if (idade>=18 && idade<=25) {
			System.out.println("18-25 adulto");
		}
		scan.close();	

	}

}

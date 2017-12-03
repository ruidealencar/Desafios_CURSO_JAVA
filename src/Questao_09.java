import javax.swing.JOptionPane;

public class Questao_09 
{

	public static void main(String[] args) 
	{
		
		int numAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos estão presentes?"));
		int i=0;
		
		while (i<numAlunos) 
		{
			String curso = JOptionPane.showInputDialog("Qual curso?");
			String cidade =JOptionPane.showInputDialog("Qual cidade?");
			String estado = JOptionPane.showInputDialog("Qual estado?");
			System.out.println(curso);
			System.out.println(cidade);
			System.out.println(estado);
			i++;
		}
		
	}

}

import javax.swing.JOptionPane;

public class Questao_07 
{

	public static void main(String[] args)
	{
		String mes=JOptionPane.showInputDialog("Digite um mês");
		switch (mes) {
		case "dezembro": 
			JOptionPane.showMessageDialog(null,"ALTA TEMPORADA");
		break;
		case "janeiro": 
			JOptionPane.showMessageDialog(null,"ALTA TEMPORADA");
		break;
		case "fevereiro": 
			JOptionPane.showMessageDialog(null,"ALTA TEMPORADA");
		break;
		case "junho": 
			JOptionPane.showMessageDialog(null,"ALTA TEMPORADA");
		break;
		case "julho": 
			JOptionPane.showMessageDialog(null,"ALTA TEMPORADA");
		break;

		default:
			JOptionPane.showMessageDialog(null,"BAIXA TEMPORADA");
			break;
		}

	}

}
